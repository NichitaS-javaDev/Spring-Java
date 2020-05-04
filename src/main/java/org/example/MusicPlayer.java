package org.example;

import java.util.ArrayList;
import java.util.Random;

public class MusicPlayer {
    ArrayList<Music> list;

    public MusicPlayer(ArrayList list) {
        this.list = list;
    }

    public void playMusic(){
        System.out.println("Now is playing : " + list.get(new Random().nextInt(3)).getSong());
    }
}


