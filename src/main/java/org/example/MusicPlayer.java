package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    Music music;
    String name;
    int volume;

    List<Music> playList = new ArrayList<Music> ();

    public void doMyInit(){
        System.out.println("Initialization");
    }

    public void doMyDestroy(){
        System.out.println("Destroying");
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }

    public void setMusic(Music music){
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        for (Music l: playList) {
            System.out.println(l.getSong());
        }
    }
}
