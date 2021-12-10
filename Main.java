package com.sharpsailor;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Sharpsailor's world  ");
        System.out.println("Enter your Username ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello "+name );
        System.out.println("Start the game");
        System.out.println("\t1. Yes ");
        System.out.println("\t2. No  ");
        int start = scan.nextInt();
                if(start==2){
                    System.out.println("Exit Confirmed");
                }
        while(start!=1 ) {
            if (start != 2) {
                System.out.println("Invalid input ");
                System.out.println("Start the game");
                System.out.println("\t1. Yes ");
                System.out.println("\t2. No  ");
                start = scan.nextInt();
            }

    }

        System.out.println("You will get 5 chances to guess the correct number on  the dice until you get the correct guess ");
        Random random = new Random();
        int x = random.nextInt(6)+1;
        System.out.println("Guess any number between 1 to 6 of a dice ");
        int userInput = scan.nextInt();
        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish= false;
        while(!shouldFinish){
            timesTried++;
            if (timesTried<=5){
                if (userInput==x){
                    hasWon= true;
                    shouldFinish= true;
                }else if (userInput>x){
                    System.out.println("Guess low");
                    userInput= scan.nextInt();
                }else{
                    System.out.println("Guess High ");
                    userInput = scan.nextInt();
                }
            }else{
                shouldFinish=true;
            }
        }
        if (hasWon){
            System.out.println("Congratulations! You Played very well and guessed   "+ timesTried);
        }else{
            System.out.println("Game over!");
            System.out.println("The Dice number was"+x );
        }
    }
}
