package com.company;

import java.util.Scanner;

public class j_17_pass_fail_checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte s1,s2,s3;
        System.out.print("Enter your marks in Physics: ");
        s1 = sc.nextByte();
        System.out.print("Enter your marks in Chemistry: ");
        s2 = sc.nextByte();
        System.out.print("Enter your marks in mathematics: ");
        s3 = sc.nextByte();

        float avg = (s1+s2+s3)/3.0f;
        System.out.println("Your average is: "+avg);
        if(avg>=40 && s1>=33 && s2>=33 && s3>=33){
            System.out.println("Congratulations!You have been promoted!");
        }
        else {
            System.out.println("Sorry! You have not been promoted, Please try again next year!");
        }
    }
}
