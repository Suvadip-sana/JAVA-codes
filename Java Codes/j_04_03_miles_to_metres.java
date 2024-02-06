package com.company;
import java.util.Scanner;
public class j_04_03_miles_to_metres {
    public static void main(String[] args) {
        System.out.print("Enter distance in miles -> ");
        Scanner sc = new Scanner(System.in);
        float miles = sc.nextFloat();
        float metres = (float) (1609.344*miles);
        System.out.println("The distance in mitres will be -> "+metres);
    }
}
