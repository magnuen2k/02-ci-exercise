package com.example.demo;

import java.util.Random;

/**
 * Exercise Implement the rest of the code neccessary
 */
public class Game {

    private int rolls = 0;
    public int score = 0;

    int roll(int pins) {
        Random rand = new Random();
        score += rand.nextInt(pins);
        return score;
    }

    int score() {
        return score;
    }

}
