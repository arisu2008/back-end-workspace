package com.kh.example.practice2.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.practice2.model.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	private void addLastList(Music music) {
		if(!music.getArtist().equals("")&& !music.getSong().equals("")){
			list.add(music);
		}
	}
	
	private boolean  addFirstList(Music music) {
		if(!music.getArtist().equals("")&& !music.getSong().equals("")){
		list.add(0, music);
		return true;
		}
		return false;
	}

	public  printAll() {
		return list;
	}
	
	private void searchMusic(String song) {
		for(Music music : list) {
			if(music.getSong().)
		}
	}
	
	private void removeMusic() {
		
	}
	
	private void updateMusic() {
		
	}
	
	public ArrayList<Music> descArtist() {
		ArrayList<Music> cloneList = (ArrayList<Music>) list.clone();
		Collections.sort(cloneList, new ArtistDescending());
		return cloneList;
	}
	
	public ArrayList<Music> ascSong() {
		ArrayList<Music> cloneList = (ArrayList<Music>) list.clone();
		Collections.sort(cloneList, new SongAscending());
		return cloneList;
}
}














