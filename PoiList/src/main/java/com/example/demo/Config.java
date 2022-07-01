package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public List<String> primaryTag() {
        return new ArrayList<String>();
    }

    @Bean
    public List<Images> images() {
        return new ArrayList<Images>();
    }



@Bean
    public Destinations destinations(){
    ArrayList<Images>lista = new ArrayList<Images>();
    List<String>primaryTag= new ArrayList<String>();
        return new Destinations("officialName","locPagName",true, true,"22", 5,
                "ddd",new Geometry(222,333),lista,
                new Description("s"),new DestinationDescriptionShortType("f"), new DestinationDescriptionLong("ss"),"f","dd",new Opening_hours("s"), primaryTag,333,"country",300,45,"30€");
}
}