package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AuthorApp {

	public static void main(String[] args) {
		listAuthors();
//		insertAuthors();
//		deleteAuthors();
//		updateAuthor();
		searchAuthors();
//		listAuthors();
	}
	private static void listAuthors() {
		AuthorDao dao = new AuthorDaoOracleImpl();
		List<AuthorVo> list = dao.getList();
		// Iterator 추출
		Iterator<AuthorVo> it = list.iterator();
		
		while (it.hasNext()) { // 내용 더 있으면
			AuthorVo vo = it.next(); // 내용 불러오기
			System.out.printf("%d, %s, %s%n", vo.getId(),vo.getName(),vo.getBio());
		}
	}
	
	private static void insertAuthors() {
		// scanner 로 이름, bio 정보를 입력 받는다. -> DAO 에서 INSERT
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.next();
		System.out.print("경력: ");
		String bio = scanner.next();
		
		AuthorVo vo = new AuthorVo(name, bio);
		
		AuthorDao dao = new AuthorDaoOracleImpl();
		boolean success = dao.insert(vo);
		
		System.out.println(success ? "성공": "실패");
		scanner.close();
	}
	private static void deleteAuthors() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("DELETE ID: ");
		long authorId = scanner.nextLong();
		AuthorDao dao = new AuthorDaoOracleImpl();
		boolean success = dao.delete(authorId);
		
		System.out.println(success ? "성공":"실패");
		scanner.close();
	}
	private static void updateAuthor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("UPDATE ID: ");
		long authorId = scanner.nextLong();
		System.out.print("UPDATE NAME: ");
		String name = scanner.next();
		System.out.print("UPDATE BIO: ");
		String bio = scanner.next();
		
		AuthorVo vo = new AuthorVo(authorId, name, bio);
		AuthorDao dao = new AuthorDaoOracleImpl();
		
		boolean success = dao.update(vo);
		
		System.out.println(success ? "성공": "실패");
	}
	private static void searchAuthors() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("SEARCH: ");
		String keyword = scanner.next();
		
		AuthorDao dao = new AuthorDaoOracleImpl();
		List<AuthorVo> list = dao.search(keyword);
		
		Iterator<AuthorVo> it = list.iterator();
		
		while(it.hasNext()) {
			AuthorVo vo = it.next();
			System.out.println(vo);
		}
		scanner.close();
	}

}
