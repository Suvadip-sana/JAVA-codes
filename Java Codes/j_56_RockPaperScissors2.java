package com.company;

import java.util.Random;
import java.util.Scanner;


public class j_56_RockPaperScissors2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playAgain;

        do {
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
            int userInput = sc.nextInt();

               if (userInput < 0 || userInput > 2) {
                   System.out.println("Invalid choice. Quitting the game.");
                   break;
               }



            Random random = new Random();
               int computerInput = random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("Draw");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("You win");
        }
        else{
            System.out.println("Computer wins!");
        }
        System.out.println("Computer choice is " + computerInput);
        System.out.println("Do you want to play again? (1 for yes, 0 for no)");
            playAgain = sc.nextInt();
        }while (playAgain == 1);

        sc.close();

    }
}
