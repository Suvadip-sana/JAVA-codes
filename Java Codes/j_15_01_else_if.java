package com.company;

import java.util.Scanner;

public class j_15_01_else_if {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46) {
            System.out.println("You are semi experienced!");
        }
        else if(age>36){
            System.out.println("You are Not much experienced!");
        }
        else {
            System.out.println("You are not experienced!");
        }

    }
}
