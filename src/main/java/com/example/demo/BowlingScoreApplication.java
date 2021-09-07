package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BowlingScoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BowlingScoreApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Welcome to Bowling");

            Game game = new Game();

            System.out.println("Rolling..");
            game.roll(10);

            System.out.println("Your score is: " + game.score());



        };
    }


}
