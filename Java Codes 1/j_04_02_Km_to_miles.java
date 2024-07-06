package com.company;

import java.util.Scanner;

public class j_04_02_Km_to_miles {
    public static void main(String[] args) {
        System.out.print("Enter the distance in kilometers -> ");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        float miles = (float)(0.6213711922*km);//kilometer to mile conversion(1km = 0.6213711922miles)
        System.out.println("Distance in mile will be -> "+miles);
    }
}
