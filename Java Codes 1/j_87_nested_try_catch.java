package com.company;

import java.util.Scanner;

public class j_87_nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of index: ");
        int ind = sc.nextInt();
        try {
            System.out.println("Welcome to NDP");
            try{
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
