package org.example;

public class SmartRadio implements MusicPlayer,Recorder, Radio {
    @Override
    public void playMusic(String song) {
        System.out.println("Playing song on SmartRadio: " + song);
    }

    @Override
    public void recordAudio(String fileName) {
        System.out.println("Recording audio on SmartRadio to file: " + fileName);
    }

    @Override
    public void tuneRadio(String station) {
        System.out.println("Tuning into radio station: " + station);
    }
}
