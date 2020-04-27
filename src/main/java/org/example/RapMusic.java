package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RapMusic implements Music {

    public ArrayList getSong(){
        return createList();
    }

    @Bean
    public ArrayList createList() {
        ArrayList list = new ArrayList();
        list.add("DarkMen");
        list.add("Tbilisi Music ");
        list.add("Colibri");
        return list;
    }
}
