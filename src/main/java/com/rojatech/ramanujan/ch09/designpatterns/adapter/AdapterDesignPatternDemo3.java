package com.rojatech.ramanujan.ch09.designpatterns.adapter;
interface MediaPlayer {
	void play(String audioType, String fileName);
}

interface AdvancedMediaPlayer {
	void playVlc(String fileName);
	void playMp4(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("play VLC file " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
	}
	
}

class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("play MP4 file " + fileName);
	}
	
}

class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		}
	}
	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
		}
	}
	
}

class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Play MP3 file " + fileName);
		} else if (audioType.equalsIgnoreCase("vlc") || (audioType.equalsIgnoreCase("mp4"))) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media type " + audioType + "not supported");
		}	
	}
}

public class AdapterDesignPatternDemo3 {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "How to Name it");
		audioPlayer.play("vlc", "Pursuit of happiness");
		audioPlayer.play("mp4", "October sky");
	}
}
