package com.kh.example.practice2.model;

public class Music {

	
	private String artist;
	private String song;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public Music(String artist, String song) {
		super();
		this.artist = artist;
		this.song = song;
	}
	@Override
	public String toString() {
		return "Music [artist=" + artist + ", song=" + song + "]";
	}
}
