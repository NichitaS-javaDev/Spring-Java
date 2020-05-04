package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class Config {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public ArrayList createPlayList(){
        ArrayList playList = new ArrayList();
        playList.add(classicalMusic());
        playList.add(rapMusic());
        playList.add(rockMusic());
        return playList;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(createPlayList());
    }
}
