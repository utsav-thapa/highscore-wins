package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a game score: ");
        String input = scanner.nextLine();

        //splitting the pipe
        String[] stadium = input.split("\\|");

        String[] homeAway = stadium[0].split(":");

        String[] score = stadium[1].split(":");

        if (Integer.parseInt(score[0]) > Integer.parseInt(score[1])) {
            System.out.println("Winner : " + homeAway[0]);
        } else if (Integer.parseInt(score[0]) <Integer.parseInt(score[1])) {
            System.out.println("Winner : " + homeAway[1]);
        } else {
            System.out.println("Game tied.");
        }

//        for (int i = 0; i < score.length; i++) {
//            System.out.println(score[i]);
//        }
//
//        for (int i = 0; i < stadium.length; i++) {
//                System.out.println(stadium[i]);

//
//            }


        }



}
