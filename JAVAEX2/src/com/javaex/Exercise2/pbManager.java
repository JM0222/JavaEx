package com.javaex.Exercise2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class pbManager {
	static final String rootPath = System.getProperty("user.dir") + "\\";
	static final String filename = rootPath + "pbook.txt";
	
	//personinfo 참조
	
	
	protected List<personinfo> readingBookList() {
		Reader reader = null;
		BufferedReader br =null;
		
		List<personinfo> list = new ArrayList<>();
		try {
			// filename 읽어오기
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			// 한줄 단위 읽기 가능(보조스트림)
			String line = null; 
			while ((line = br.readLine()) != null) {
				// StringTokenizer 읽어드린 line 을 쉼표 구분자로
				StringTokenizer st = new StringTokenizer(line, ",");
				personinfo person = new personinfo(st.nextToken(), st.nextToken(), st.nextToken());
				list.add(person); 
			}
		}catch (FileNotFoundException e) {
			System.err.println("File Not Exist");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	protected void onelistPrint() {
		List<personinfo> rdb = readingBookList();
		for( int i = 0; i < rdb.size(); i++) {
			System.out.print((i+1) + "."+ rdb.get(i).getName() + "\t" + rdb.get(i).getPnum()
					+ "\t" + rdb.get(i).getHnum()+"\n");
		}
	}
	
	protected personinfo twolistadd(Scanner sc){
		
		System.out.print(">이름 : ");
		String name = sc.next();
		System.out.print(">휴대전화 : ");
		String pnum = sc.next();
		System.out.print(">집전화 : ");
		String hnum = sc.next();
		personinfo person = new personinfo(name, pnum, hnum);
		return person;
		
	}
	protected void twolistadd2(personinfo person) {
		Writer writer = null;
		BufferedWriter bw = null;
		try {
			writer = new FileWriter(filename, true);
			bw = new BufferedWriter(writer);
			bw.newLine();
			bw.append(person.getName() + "," + person.getPnum() + "," + person.getHnum());
			bw.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
				bw.close();
			}catch (Exception e) {
				
			}
		}
	}
	protected void threeDelete(int num) {
		Writer writer = null;
		BufferedWriter bw = null;
		try {
			List<personinfo> list = readingBookList();
			list.remove(num -1); // idx 
			
			writer = new FileWriter(filename);
			bw = new BufferedWriter(writer);
			
			// 마지막줄만  \n 아님
			for (int i =0; i < list.size(); i++) {
				if (i == list.size() -1) {
					bw.write(list.get(i).getName()+","+list.get(i).getPnum()+","+list.get(i).getHnum());
				} else {
					bw.write(list.get(i).getName()+","+list.get(i).getPnum()+","+list.get(i).getHnum());
					bw.newLine();
				}
			}
			bw.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			}catch (Exception e) {
				
			}
		}
	}
	
	protected void fourSearch(String str) {
		List<personinfo> list = readingBookList();
		for (int i = 0; i <list.size();i++) {
			if (list.get(i).getName().contains(str)) {
				System.out.println((i+1) + "."+ list.get(i).toString());
			}
		}
		System.out.println();
	}
	
	
			
			
}
