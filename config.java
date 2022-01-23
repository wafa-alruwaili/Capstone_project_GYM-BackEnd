package com.example.GYM.Jasmine.model.config;

import com.example.GYM.Jasmine.model.Repository.LessonsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LessonsConfig {


    @Bean
    CommandLineRunner commandLineRunner1(LessonsRepository repository){
        return args -> {




        };
    }
}