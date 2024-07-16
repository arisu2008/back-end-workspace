package com.kh.example.practice2.controller;

import java.util.ArrayList;

import com.kh.example.practice2.model.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	private void addLastList(Music music) {
		if(!music.getArtist().equals("")&& !music.getSong().equals("")){
			list.add(music);
		}
	}
	
	private void addFirstList() {
		
	}

	private void printAll() {
		
	}
	
	private void searchMusic() {
		
	}
	
	private void removeMusic() {
		
	}
	
	private void updateMusic() {
		
	}
	
	private void descArtist() {
		
	}
	
	private void ascSong() {
	
}
}