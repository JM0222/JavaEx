package com.javaex.api.objectclass.v4;

public class LangClassTest {

	public static void main(String[] args) {
		Scoreboard s1 = new Scoreboard(new int[] {10,20,30,40,50});
		System.out.println("s1 = " + s1);
		
		// 복제
		Scoreboard s2 = s1.getClone();
		System.out.println("s2 = " + s2);
		
		System.out.println(s1 == s2);
		
		s2.getScores()[2] = 100;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		// 내부 필드의 주소 비교 (필드가 복제되기떄문에 같다)
		System.out.println("s1.scores와 s2.scores는 같은 객체? "+
		(s1.getScores() == s2.getScores()));
	}

}
