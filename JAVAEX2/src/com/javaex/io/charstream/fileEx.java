package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class fileEx {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("읽기경로"));
			pw = new PrintWriter(new FileWriter("타겟경로"));
			String line = null;
			while((line = br.readLine())!= null) {
				pw.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			pw.close();
			try {
				br.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
