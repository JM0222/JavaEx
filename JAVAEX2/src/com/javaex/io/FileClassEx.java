package com.javaex.io;

import java.io.File;
import java.io.IOException;

// File 클래스 
//  파일의 정보를 확인하고 파일,Dir를 생성 삭제 가능
//  파일 내부 수정 Stream 에서 담당
public class FileClassEx {
	// 현재 프로젝트 내의 루트 디렉터리 위치
	private static String rootPath = System.getProperty("user.dir")+"\\files\\";
	
	public static void main(String[] args) {
		// File 객체 생성
		
		File root = new File(rootPath);
		
		// 파일이 실제 존재하는지 확인
		
		System.out.println(rootPath + ":"+ root.exists());
		
		// 만약 디렉터리가 존재하지 않으면
		if (!root.exists()) {
			root.mkdirs();
		}
		
		printInfo(root);
		
		// 새로운 파일 생성하고자 할 경우
		
		File file = new File(rootPath + "\\myFile.txt\\"); // 새 파일이 생성되는거 아님
		System.out.println("myfile.txt 생성");
		if (!file.exists()) { // 파일이 없으면
			try {
			file.createNewFile(); // 파일 생성
			}catch (IOException e) {
				System.err.println("파일을 만들지 못햇습니다.");
			}
		}
		printInfo(root);
		
//		 파일 삭제
		System.out.println("-->myfile.txt 삭제");
		file.delete();
		printInfo(root);
	}
	private static void printInfo(File file) {
		System.out.println("----------------");
		// 파일이 디렉토리이면  파일 목록 출력
		// 파일이면 파일 정보 출력
		if (file.isDirectory()) {
			System.out.println("Directiory:" + file.getName());
			// 파일 목록
			File[] files = file.listFiles();
			// 파일 목록
			for (File f: files) {
				System.out.print(f.isDirectory() ? "d" : "f");
				System.out.println(f.getName() + ":" + f.length());//파일사이즈출력
			}
		} else {
			System.out.println("file: " + file.getName() + ":" + file.length());
		}
		System.out.println("----------------");
	}

}
