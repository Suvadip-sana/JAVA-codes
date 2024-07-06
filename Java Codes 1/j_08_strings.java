package com.company;
import java.util.Scanner;

public class j_08_strings {
    public static void main(String[] args) {
        /*String name = new String("subdir"); //as a class
        String name = "subdir"; //as a data type
        int a = 8;
        float b = 6.65756f;
        //different way to print
        System.out.printf("\nThe value of a is %d and the value of b is %f\n",a,b);
        System.out.format("\nThe value of a is %d and the value of b is %f\n",a,b);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String st = sc.nextLine();
        System.out.print("Your name is: "+st);

    }
}

