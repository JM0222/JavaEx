package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "myFile.txt";
	public static void main(String[] args) {
//		writeTextEx();
		readTextEx();

	}
	// 읽어오기
	private static void readTextEx() {
		Reader reader = null;
		try {
			reader = new FileReader(filename);
			int data = 0; // int -> char , 4->2
			while ((data = reader.read()) != -1) {
				System.out.print((char)data); // char으로 캐스팅 필요
			}
			System.out.println();
		}catch (FileNotFoundException e) {
			System.err.println("파일을 찾지못했습니다.");
		}catch (IOException e) {
			
		}finally {
			try {
				reader.close();
			} catch(Exception e) {
				
			}
		}
	}
	
	
	private static void writeTextEx() {
		// 문자기반 출력 스트림의 최고 조상은 Writer
		Writer writer = null;
		
		try {
			writer = new FileWriter(filename);
			System.out.println("파일을 열었습니다.");
			writer.write("hello world \n hi java");
			writer.write("2021.03");
			System.out.println("파일을 기록했습니다.");
			// 내부 버퍼 비우기
			writer.flush();
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
				
			}
		}
	}

}
