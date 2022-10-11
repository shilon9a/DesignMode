package Adapter.AdvancedMediaPlayer.impl;

import Adapter.AdvancedMediaPlayer.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playInVLC(String fileName) {
        System.out.println("this is VlcPlayer，fileName："+fileName);
    }

    @Override
    public void playInMP4(String fileName) {
    }
}
