package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    Music classicalMusic, rapMusic, rockMusic;

    @Autowired
    public MusicPlayer(Music classicalMusic, Music rapMusic, Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre){
        if(genre == MusicGenre.Classical) {
            System.out.println("Now is playing : " + classicalMusic.getSong().get(new Random().nextInt(3)));
        }
        if (genre == MusicGenre.Rap){
            System.out.println("Now is playing : " + rapMusic.getSong().get(new Random().nextInt(3)));
        }
        if (genre == MusicGenre.Rock){
            System.out.println("Now is playing : " + rockMusic.getSong().get(new Random().nextInt(3)));
        }
    }
}


