package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
//		arrayBasic();
//		twoDimens();
		arrayCopy();

	}
	// 배열복사 ( System 객체 이용 )
	private static void arrayCopy() {
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		System.arraycopy(source, 0, target, 0, source.length);
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		
		// Enhanced for 문
		for (int value: target) {
			System.out.print(value);
		}
		System.out.println();
	}
	
	
	private static void twoDimens() {
		int[][] twoDimens = new int[5][10]; // 5행 10열
		// 기본 데이터가 있을 경우
		int table[][] = { 
				{1,2,3,4,5},
				{2,3,4,5,6},
				{3,4,5,6,7}
		};
		int total = 0;
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				System.out.print(table[row][col]+ "\t");
				total += table[row][col];
			}
			System.out.println();
		}
		System.out.println("total: "+ total);
	}
	private static void arrayBasic() {
		// 배열의 선언
		String[] names; // 타입 [] 식별자
		int scores[]; // 타입 식별자 []
		
		// 초기화
		
		names = new String[] {
				"a","b","c","d"
		};
//		System.out.println(names);
		
		scores = new int[4];
		
		System.out.println("Length of scores:" + scores.length);
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 75;
		scores[3] = 100;
//		System.out.println(scores);
		float heights[] = {
				178.5f,
				178.5f,
				178.5f,
				178.5f
		};
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s,(%.2f): score = %d%n",names[i],heights[i],scores[i]);
		}
		
		int [] scores2 = scores; // 참조 복사 (사용지양) 주소만 복사한것
		
		scores2[3] = 100;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+"\t");
		}
		System.out.println();
	}

}
