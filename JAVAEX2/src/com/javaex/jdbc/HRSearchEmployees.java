package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class HRSearchEmployees {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl,"hr","hr");
			
			System.out.print("검색어: ");
			String keyword = scanner.next();
			// Query
			String sql = "SELECT first_name, last_name, " +
					"email, phone_number, hire_date " +
					"FROM employees " +
					"WHERE lower(first_name) LIKE '%" + keyword + "%' OR " +
					"lower(last_name) LIKE '%" + keyword + "%'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
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
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}
