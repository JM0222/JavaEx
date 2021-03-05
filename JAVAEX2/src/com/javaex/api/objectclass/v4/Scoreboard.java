package com.javaex.api.objectclass.v4;

import java.util.Arrays;

public class Scoreboard implements Cloneable{
	// 참조형 필드
	
	private int[] scores;
	
	// 생성자
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}
	
	// getter/ setter

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	
	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	
	public Scoreboard getClone() {
		Scoreboard clone= null;
		try {
			clone = (Scoreboard)clone(); // 복제 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	// clone 메서드재정의 (깊은복제)
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 1. 얕은복제 시도
		Scoreboard clone = (Scoreboard)super.clone();
		// 2. 내부 참조 필드 복제(깊은복제)
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}
	

}
