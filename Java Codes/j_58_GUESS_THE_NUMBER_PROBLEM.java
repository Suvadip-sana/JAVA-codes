package com.company;
import java.util.Random;
import java.util.Scanner;

class game{
    public  int number;
    public int inputNumber;
    public int noOfGuesses = 0;
    public  int getNumberOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    game(){
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.format("Yes! You guess it right, It was %d\nYou guessed it in %d attempts.\n" ,number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low....");
        } else if(inputNumber>number) {
            System.out.println("Too high....");
        }
        return  false;
    }
}
public class j_58_GUESS_THE_NUMBER_PROBLEM {
    public static void main(String[] args) {
        /*Create a class Game, which allows a user to play "Guess the Number"
        game once. Game should have the following methods:
        1. Constructors to generate the random number,
        2. Take userInput() to take a user input of number,
        3. isCorrectNumber() to detect whether the number entered by the user is true,
        4. Getter and Setter for noOfGuesses,
        Use properties such as noOfGuesses(int), etc to get this task done,
         */
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();

        }
    }
}
