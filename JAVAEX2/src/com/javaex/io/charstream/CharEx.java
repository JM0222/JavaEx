package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharEx {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// bufferedreader 
		try {
			String line = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}// 키보드로부터 입력받은걸 line 변수에 넣는다
		
	}

}
