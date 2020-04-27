package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music {

    public ArrayList getSong(){
        return createList();
    }

    @Bean
    public ArrayList createList() {
        ArrayList list = new ArrayList();
        list.add("Spring Rhapsody");
        list.add("Is winter now...");
        list.add("Rhapsody No.14");
        return list;
    }
}
