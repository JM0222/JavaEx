package com.javaex.Exercise2;

public class pbView {
	pbManager pbm = new pbManager();
	
	public void viewStart() {
		System.out.println("********************************");
		System.out.println("*       전화번호 관리 프로그램       *");
		System.out.println("********************************");
	}
	
	public void viewMenu() {
		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.println("--------------------------------");
		System.out.println(">메뉴 번호 : ");
	}
	
	public void viewEnd() {
		System.out.println("********************************");
		System.out.println("*           감사합니다            *");
		System.out.println("********************************");
	}
	
	public void viewErr() {
		System.out.println("[다시 입력해주세요.]");
	}
	
	public void viewList() {
		System.out.println("<1. 리스트>");
		pbm.onelistPrint();
		System.out.println();
	}
	
	public void viewAdd() {
		System.out.println("<2. 등록>");
	}
	
	public void viewDelete() {
		System.out.println("<3. 삭제>");
		System.out.print(">번호 : ");
	}
	
	public void viewSearch() {
		System.out.println("<4. 검색>");
		System.out.print(">이름 : ");
	}
}
