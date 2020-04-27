package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {

    public ArrayList getSong(){
        return createList();
    }

    @Bean
    public ArrayList createList() {
        ArrayList list = new ArrayList();
        list.add("Kill me Please");
        list.add("No words, no...");
        list.add("Cry Marry");
        return list;
    }
}
