package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "last-leaf.txt";
	static final String target = rootPath + "lash-leaf-filtered.txt";
	public static void main(String[] args) {
		// main stream
		Reader reader = null;
		Writer writer = null;
		
		// 보조 스트림
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			reader = new FileReader(source);
			writer = new FileWriter(target);
			
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			// 편의 기능으로 한줄 단위(개행된 문자열) 입출력 할수있다.
			String line = null;
			
			while((line = br.readLine()) != null) {
//				System.out.println(line);
				// 읽은 라인중에서 leaf or leaves 단어 포함된 라인만 target으로 저장
				if (line.toLowerCase().contains("leaf")||
						line.toLowerCase().contains("leaves")) {
					System.out.println(line);
					bw.write(line);
					bw.newLine(); // 개행 출력
				}
			}
			System.out.println("Complete filtering");
		}catch (FileNotFoundException e) {
			System.err.println("File not found");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			}catch (IOException e) {
				
			}
		}

	}

}
