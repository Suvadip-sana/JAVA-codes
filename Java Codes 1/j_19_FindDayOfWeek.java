package com.company;

import java.util.Scanner;

public class j_19_FindDayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte day;
        System.out.print("Enter the number: ");
        day = sc.nextByte();

        switch (day) {
            case 1 -> System.out.println("The day is Monday!");
            case 2 -> System.out.println("The day is Tuesday!");
            case 3 -> System.out.println("The day is Wednesday!");
            case 4 -> System.out.println("The day is Thursday!");
            case 5 -> System.out.println("The day is Friday!");
            case 6 -> System.out.println("The day is Saturday!");
            case 7 -> System.out.println("The day is Sunday!");
            default -> System.out.println("Please enter between 1 to 7");
        }
    }
}
