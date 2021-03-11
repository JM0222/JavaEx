package com.javaex.Exercise;

public class PersonInfo {
	// 필드
	private int id;
	private String name;
	private String pnum;
	private String hnum;
	// getter / setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getHnum() {
		return hnum;
	}
	public void setHnum(String hnum) {
		this.hnum = hnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public void ShowInfo() {
//		System.out.print("이름:" + this.name);
//		System.out.print("휴대전화:"+ this.pnum);
//		System.out.print("집전화:"+ this.hnum);
//	}
}
