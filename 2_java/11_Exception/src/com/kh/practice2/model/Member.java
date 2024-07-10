package com.kh.practice2.model;

public class Member {

	private String musicname;
	private String singer;
	
	
	public String getMusicname() {
		return musicname;
	}
	public void setMusicname(String musicname) {
		this.musicname = musicname;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public Member(String musicname, String singer) {
		super();
		this.musicname = musicname;
		this.singer = singer;
	}
	
	public String toString() {
	
		return super.toString();
	}
	
	
	
	
}
