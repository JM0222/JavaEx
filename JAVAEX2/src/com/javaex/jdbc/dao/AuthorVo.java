package com.javaex.jdbc.dao;
// DTO(VO) : 계층간 테이터 교환을 위한 자바 객체
// 	 	     로직 X 
// 		     필드, getter/setter , to String , equals 정도
public class AuthorVo {
	// 필드
	private Long id; // DTO 객체에서는 기본타입은 잘 사용하지 않는다(null이 가능해야 한다)
	private String name;
	private String bio;
	
	// 생성자
	public AuthorVo() {
		// 기본 생성자
	}
	
	public AuthorVo(String name, String bio) {
		this.name = name;
		this.bio = bio;
	}
	
	public AuthorVo(Long id, String name, String bio) {
		this(name,bio);
		this.id = id;
	}
	//  Getter / Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	// 객체 출력 
	@Override
	public String toString() {
		return "AuthorVo [id=" + id + ", name=" + name + ", bio=" + bio + "]";
	}
	
	
	
}
