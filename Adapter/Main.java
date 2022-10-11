package Adapter;

import Adapter.MediaPlayer.MediaPlayer;
import Adapter.MediaPlayer.impl.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer=new AudioPlayer();
        mediaPlayer.play("mp3","fileOne");
        mediaPlayer.play("mp4","fileTwo");
        mediaPlayer.play("VLC","fileThree");
    }
}
