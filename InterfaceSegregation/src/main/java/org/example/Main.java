package org.example;

// Es mejor tener varias interfaces pequeñas y específicas
public class Main {
    public static void main(String[] args) {
        // Usamos un MP3 player que solo reproduce música
        MusicPlayer mp3Player = new MP3Player();
        mp3Player.playMusic("Jailhouse - Elvis Presley");

        // Usamos un grabador de voz que solo graba audio
        Recorder voiceRecorder = new VoiceRecorder();
        voiceRecorder.recordAudio("meeting_recording.wav");

        // Usamos un dispositivo SmartRadio hace todo
        SmartRadio smartRadio = new SmartRadio();
        smartRadio.playMusic("Bohemian Rhapsody - Queen");
        smartRadio.recordAudio("lecture_recording.mp3");
        smartRadio.tuneRadio("Classic Rock Radio");
    }
}