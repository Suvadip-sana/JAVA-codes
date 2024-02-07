package com.company;
import java.util.Scanner;
import java.util.Random;

public class j_55_ROCK_PAPER_SCISSORS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors Game!");
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");
        System.out.println("To quit the game, enter any other number.");

        int userChoice;
        int computerChoice;
        int playAgain;

        do {
            // Get user's choice
            System.out.print("Enter your choice: ");
            userChoice = scanner.nextInt();

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Quitting the game.");
                break;
            }

            // Generate computer's choice
            computerChoice = random.nextInt(3) + 1;//This generates a random number between 0 and 2, to which we add 1 to get a number between 1 and 3

            // Determine the winner
            determineWinner(userChoice, computerChoice);

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (1 for yes, 0 for no)");
            playAgain = scanner.nextInt();
        } while (playAgain == 1);

        scanner.close();
    }

    public static void determineWinner(int userChoice, int computerChoice) {
        System.out.println("Computer chose: " + getChoiceString(computerChoice));
        System.out.println("You chose: " + getChoiceString(userChoice));

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you lose. Better luck next time!");
        }
    }

    public static String getChoiceString(int choice) {
        switch (choice) {
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

