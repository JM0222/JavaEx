package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
		useMethods();

	}
	private static void useMethods() {
		// String 다양한 메서드들 
		String source = "java Programming, javascript programming";
		System.out.println(source);
		
		// length
		System.out.println("length: "+ source.length());
		System.out.println("5번 idx: "+ source.charAt(5));
		System.out.println(source.toLowerCase());
		System.out.println(source.toUpperCase());
		// 검색 메서드
		int index = 0;
		index = source.indexOf("java");
		System.out.println(index);
		// 1번쨰부터 Searching 검색내용 없을경우 -1 반환 
		index = source.indexOf("java",1);
		System.out.println(index);
		index = source.lastIndexOf("java");
		System.out.println(index);
		
		// Substring
		System.out.println("18번인덱스~ 끝 "+ source.substring(18));
		System.out.println("18번인덱스~ 22 "+ source.substring(18,22));
		
		// replace
		System.out.println("replace "+ source.replace("java", "Python"));
		// 변환 , 치환, 추출 메서드 수행해도 원본 변경 x
		
		// whitespace 제거
		String str = " hello  ";
		System.out.println(str.trim());
		// 문자열 분절 
		String words[] =source.split(" ");
		for (String data: words) {
			System.out.println(data);
		}
		// 문자열의 비교: 
		// comepareTo 선후 관계 따지는것
		// 같으면 0 , 작으면 -1, 크면 1 반환
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("ABC".compareTo("ABC"));
	}
	
	
	
	
	public static void stringBasic() {
		String s1 = "Java"; // 리터럴 
		String s2 = new String("Java"); // 새로운 객체
		String s3 = "Java"; // 리터럴
		
		System.out.println("s1, s2 같은객체인가요?" + (s1==s2));
		System.out.println("s1, s3 같은객체인가요?" + (s1==s3));
		// String 은 char 의 집합
		char letters[] = {'j','a','v','a'};
		String s4 = new String(letters);
		System.out.println(s4);
		
		//value of 메서드 -> 기본 타입을 문자열로 변환
		String s5 = String.valueOf(3.14159f);
		System.out.println(s5);
	}

}
