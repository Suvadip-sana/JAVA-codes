//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Random;
import java.util.Scanner;

public class j_55_ROCK_PAPER_SCISSOR {
    public j_55_ROCK_PAPER_SCISSOR() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        Random var2 = new Random();
        System.out.println("Welcome to Rock-Paper-Scissors Game!");
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");
        System.out.println("To quit the game, enter any other number.");

        int var5;
        do {
            System.out.print("Enter your choice: ");
            int var3 = var1.nextInt();
            if (var3 < 1 || var3 > 3) {
                System.out.println("Invalid choice. Quitting the game.");
                break;
            }

            int var4 = var2.nextInt(3) + 1;
            determineWinner(var3, var4);
            System.out.println("Do you want to play again? (1 for yes, 0 for no)");
            var5 = var1.nextInt();
        } while(var5 == 1);

        var1.close();
    }

    public static void determineWinner(int var0, int var1) {
        System.out.println("Computer chose: " + getChoiceString(var1));
        System.out.println("You chose: " + getChoiceString(var0));
        if (var0 == var1) {
            System.out.println("It's a tie!");
        } else if ((var0 != 1 || var1 != 3) && (var0 != 2 || var1 != 1) && (var0 != 3 || var1 != 2)) {
            System.out.println("Sorry, you lose. Better luck next time!");
        } else {
            System.out.println("Congratulations! You win!");
        }

    }

    public static String getChoiceString(int var0) {
        switch (var0) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }
}
