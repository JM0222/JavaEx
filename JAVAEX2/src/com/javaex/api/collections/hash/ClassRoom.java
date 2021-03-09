package com.javaex.api.collections.hash;

public class ClassRoom {
	// 필드
	private String subject;
	private String roomName;
	
	// 생성자
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	

}
