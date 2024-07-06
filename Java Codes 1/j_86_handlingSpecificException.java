package com.company;

import java.util.Scanner;

public class j_86_handlingSpecificException {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("Enter value of array-value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);

        }catch (ArrayIndexOutOfBoundsException c){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(c);

        }catch (Exception c){
            System.out.println("Some other exception occured!");
            System.out.println(c);
        }

    }
}
