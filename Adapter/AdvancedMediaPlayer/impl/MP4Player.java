package Adapter.AdvancedMediaPlayer.impl;

import Adapter.AdvancedMediaPlayer.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playInVLC(String fileName) {
    }

    @Override
    public void playInMP4(String fileName) {
        System.out.println("this is MP4Player , fileName："+fileName);
    }
}
