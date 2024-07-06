package com.company;
import java.util.Scanner;
public class j_03_Taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the users");
        Scanner sc = new Scanner(System.in);// For user input from keyboard
        System.out.print("Enter number one:");
        int a = sc.nextInt();//Method to read from keyboard(int type)
        System.out.print("Enter the number two:");
        int b = sc.nextInt();//Method to read from keyboard(int type)

        int sum = a+b;
        System.out.print("The sum of the number is:"+sum);
        /*boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.nextLine();
        System.out.println(str);*/


    }
}
