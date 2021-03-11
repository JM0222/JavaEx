package com.javaex.io.datainputstream;

import java.io.DataInputStream;
import java.io.FileInputStream;

import com.javaex.api.generics.v1.intBox;

public class DatainputEx {

	public static void main(String[] args) {
		try(
				DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));			
				
				) {
			int i = in.readInt(); // fileinput 내부적으로 read값읽어낸다	
			boolean b = in.readBoolean();
			double d = in.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
