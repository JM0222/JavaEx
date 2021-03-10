package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		// 메인스트림
		Reader reader  = null;
		// 보조스트림
		BufferedReader br = null;
		
		try {
			reader = new FileReader(filename);
			br =new BufferedReader(reader);
			
			String line = null;
			while ((line = br.readLine()) != null) {
				// line 분절
				StringTokenizer st = new StringTokenizer(line); //문자열, 2번째 인자값 default(" ",\t,\r,\n)
				while(st.hasMoreTokens()) {
					// 토큰이 더 있는가?
					String token = st.nextToken(); // 토큰받고 뒤로 이동
					System.out.print(token+" ");
				}
				System.out.println();
			}
		}catch (IOException e) {
			e.printStackTrace();
		
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				
			}
		}

	}

}
