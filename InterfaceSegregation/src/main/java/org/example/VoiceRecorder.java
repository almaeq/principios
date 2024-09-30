package org.example;

public class VoiceRecorder implements Recorder {
    @Override
    public void recordAudio(String fileName) {
        System.out.println("Recording audio to file: " + fileName);
    }
}
