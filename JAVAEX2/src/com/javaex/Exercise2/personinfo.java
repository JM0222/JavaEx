package com.javaex.Exercise2;

public class personinfo {
	String name;
	String pnum;
	String hnum;
	
	public personinfo(String name, String pnum, String hnum) {
		super();
		this.name = name;
		this.pnum = pnum;
		this.hnum = hnum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return name + "," + pnum + "," + hnum;
	}
	
	
	

}
