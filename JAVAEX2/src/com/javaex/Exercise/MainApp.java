package com.javaex.Exercise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
				PersonManager pm = new PersonManager();
        
        //저장할 위치 및 파일
        String filepath = rootPath;
        String filename = "person.txt";
        // while 문 종료 flag
        boolean flag = true;
        
        while(flag) {
        	// scanner 초기화
            scan.reset();
            System.out.println("1. 리스트, 2. 등록, 3. 삭제, 4. 검색, 5. 종료");
            System.out.println("________________________________________");
            System.out.print("메뉴번호>");
            String menuNum = scan.next();
 
            if("1".equals(menuNum)) {
            	pm.setInfoList(FileUtil.readFile(new File(filepath, filename)));
                pm.showInfo();
            }else if("2".equals(menuNum)) {
                pm.addInfo(makeInfo());
                FileUtil.writeFile(filepath, filename, pm.getInfoList());
            }else if("3".equals(menuNum)) {
            	System.out.println("3.<삭제>");
                System.out.print("번호: ");
                pm.removeInfo(scan.nextInt());
                FileUtil.writeFile(filepath, filename, pm.getInfoList());
                System.out.println("삭제완료");
            }else if("4".equals(menuNum)) {
            	System.out.println("4.<검색>");
            	pm.SearchInfo(scan.next());
            }else if("5".equals(menuNum)) {
                flag = false;
                System.out.println("시스템종료");
                System.out.println("****************************");
                System.out.println("**********감사합니다***********");
                System.out.println("****************************");
            }else {
                System.out.println("다시입력해주세요.");
                continue;    
            }
        }
        scan.close();
    }
    
    public static PersonInfo makeInfo() {
    	System.out.println("2.<등록>");
        scan.reset();
        PersonInfo person = new PersonInfo();
        
        System.out.print("이름 : ");
        person.setName(scan.next());
 
        System.out.print("휴대전화 : ");
        person.setPnum(scan.next());
 
        System.out.print("집전화 : ");
        person.setHnum(scan.next());
        
        System.out.println("등록완료");    
        
        return person;
    }

	

}
