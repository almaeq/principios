package org.example;

public class MP3Player implements MusicPlayer{
    @Override
    public void playMusic(String song) {
        System.out.println("Playing song on MP3 player: " + song);
    }
}
