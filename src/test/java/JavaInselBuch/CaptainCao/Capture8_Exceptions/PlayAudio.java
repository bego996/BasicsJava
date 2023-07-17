package JavaInselBuch.CaptainCao.Capture8_Exceptions;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PlayAudio {
    public static void playClip(String[] pathnames) throws Exception {
        int counter = 0;
        if (pathnames != null) {
            while (counter < pathnames.length) {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(new File(pathnames[counter])));
                clip.start();
                TimeUnit.MICROSECONDS.sleep(clip.getMicrosecondLength() + 50);
                clip.stop();
                counter++;
                if (counter == pathnames.length){
                    counter = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] pathnames = {"C:/Users/Bego/Desktop/Maniacal Witches.wav","C:/Users/Bego/Desktop/Dark_Laugh.wav","C:/Users/Bego/Desktop/Laugh And Applause.wav"};
        try {
            playClip(pathnames);
        } catch (Exception e) {
            System.out.println("SoundDatei nicht gefunden!");
        } finally {
            System.out.println("Sounddatei eingelesen, weiter gehts.");
        }
    }
}
