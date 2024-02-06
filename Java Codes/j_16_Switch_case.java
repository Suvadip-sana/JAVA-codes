package com.company;

import java.util.Scanner;

public class j_16_Switch_case {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("You are going to be an adult!");
                break;
            case 24:
                System.out.println("You are going to join a Job!");
                break;
            case 56:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");

        }
    }
}
