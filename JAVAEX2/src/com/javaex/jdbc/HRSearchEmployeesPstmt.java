package com.javaex.jdbc;

import java.sql.*;
import java.util.Scanner;
public class HRSearchEmployeesPstmt {
// Templates 방식 Statement 활용
	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl,"hr","hr");
			
			System.out.print("검색어: ");
			String keyword = scanner.next();
			// Query 동적으로 데이터 연결한 공간을 ?로 비워둔다
			String sql = "SELECT first_name, last_name, " +
					"email, phone_number, hire_date " +
					"FROM employees " +
					"WHERE lower(first_name) LIKE ? OR " +
					"lower(last_name) LIKE ?";
			pstmt = conn.prepareStatement(sql);
			// 동적 파라미터 설정
			pstmt.setString(1, "%"+ keyword + "%");
			pstmt.setString(2, "%" + keyword + "%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s %s: %s , %s, %s%n",
						rs.getString(1),rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getString(5));
			}
			
			
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}
