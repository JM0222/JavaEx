package com.javaex.io2;

import java.io.File;
import java.io.IOException;

public class FileClassEx2 {
	public static String rootPath = System.getProperty("user.dir")+"\\a\\";
	public static void main(String[] args) {
		File root = new File(rootPath);
		System.out.println(root);
		
		
		System.out.println(root.exists());
		
		if (!root.exists()) {
			root.mkdirs();
		}
//		printInfo(root);
		File file = new File(rootPath + "\\fileEx.txt\\");
		if (!file.exists()) {
			try {
				file.createNewFile();
			}catch (IOException e) {
				System.err.print("파일이 이미 존재하거나 없습니다.");
			}
		}
//	    file.delete();
		printInfo(root);
		File ak = new File(rootPath + "\\b\\");
		if (!ak.exists()) {
			ak.mkdirs();
		}
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
				System.out.print(f.isDirectory() ? "d " : "f ");
				System.out.println(f.getName() + ":" + f.length());//파일사이즈출력
			}
		} else {
			System.out.println("file: " + file.getName() + ":" + file.length());
		}
		System.out.println("----------------");
	}

}
