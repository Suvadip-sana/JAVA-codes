package com.company;
import java.util.Scanner;
public class j_07_Taking_input2 {
    public static void main(String[] args) {
        System.out.print("What is your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+" have a good day!");
    }
}
