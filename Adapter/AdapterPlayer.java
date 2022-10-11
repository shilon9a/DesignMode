package Adapter;

import Adapter.AdvancedMediaPlayer.AdvancedMediaPlayer;
import Adapter.AdvancedMediaPlayer.impl.MP4Player;
import Adapter.AdvancedMediaPlayer.impl.VlcPlayer;
import Adapter.MediaPlayer.MediaPlayer;

public class AdapterPlayer implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public void play(String mediaType, String fileName) {
        if(mediaType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer=new VlcPlayer();
            advancedMediaPlayer.playInVLC(fileName);
        } else if (mediaType.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer=new MP4Player();
            advancedMediaPlayer.playInMP4(fileName);
        }
    }


}
