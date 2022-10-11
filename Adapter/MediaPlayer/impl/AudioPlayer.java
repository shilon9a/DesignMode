package Adapter.MediaPlayer.impl;

import Adapter.AdapterPlayer;
import Adapter.MediaPlayer.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    AdapterPlayer adapterPlayer=new AdapterPlayer();

    @Override
    public void play(String mediaType,String fileName) {
        if(mediaType.equalsIgnoreCase("MP3")){
            System.out.println("thi is MP3，fileName："+fileName);
        } else if (mediaType.equalsIgnoreCase("MP4") || mediaType.equalsIgnoreCase("VLC")) {
            adapterPlayer.play(mediaType,fileName);
        }
        else{
            System.out.println("Invalid media");
        }
    }
}
