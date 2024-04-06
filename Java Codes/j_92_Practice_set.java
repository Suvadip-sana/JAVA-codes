package com.company;

import java.util.Scanner;


// Question 5:
class InvalidIndexException extends Exception{
    public InvalidIndexException(String message){   // Constructors
        super(message);
    }
}
public class j_92_Practice_set {
    public static void main(String[] args) {
        //Question 1: Write a java program to demonstrate syntax, logical & runtime errors.

        //Syntax error  int a = 6
//        int age = 78;
//        int year_born = 2000-78;  // logical error
//        System.out.println(6/0);


        /*Question 2: Write a java program that prints "HaHa"
                      during arithmetic exception and "HeHe" during an illegal
                      argument exception. */

//          try {
//              int a = 66/0;
//          }
//          catch (IllegalArgumentException e){
//              System.out.println("HaHa");
//          }
//          catch (ArithmeticException e){
//              System.out.println("HeHe");
//          }



        /*Question 3: Write a program that allows you to keep accessing an array
                      until a valid index is given.If max retries exceed 5 print "error"  */

//        boolean flag = true;
//        int [] marks = new int[3];
//        marks[0] = 7;
//        marks[0] = 57;
//        marks[0] = 9;
//        Scanner sc = new Scanner(System.in);
//
//        int index;
//        int i = 0;
//        while (flag && i<5){
//            try {
//                index = sc.nextInt();
//                System.out.println("The value of marks[index] is "+ marks[index]);
////                break;
//            }
//            catch (Exception e){
//                System.out.println("Invalid Index");
////                throw new ArithmeticException();
//                i++;
//            }
//        }
//        if(i>=5){
//            System.out.println("Error");
//        }


        //Question 4: Modify program in Question 3 to throw a custom execution if max retries are reached.

//        int a = 8;
//        int b = 45;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int id = sc.nextInt();
//        try {
//            int c = a/b;
//            System.out.println("The answer is: "+ c);
//        }
//        catch (RuntimeException e){
//            throw new RuntimeException();
//            System.out.println(e);
//
//        }

        //Question 5: Wrap the program in Question 3 inside a method which throws your custom exception.


        try {
            processInput();
        } catch (InvalidIndexException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
    public static  void processInput() throws InvalidIndexException {

        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 57;
        marks[2] = 9;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index: ");

        int index;
        int i = 0;
            while (flag && i < 5) {
                try {
                    index = sc.nextInt();
                    if (index < 0 || index >= marks.length) {
                        throw new InvalidIndexException("Invalid Index");
                    }
                    System.out.println("The value of marks[index] is " + marks[index]);

//                break;
                } catch (Exception e) {
                    System.out.println("Invalid Indexx");
//                throw new ArithmeticException();
                    i++;
                }
            }
            if (i >= 5) {
                System.out.println("Error");
            }
        }
    }
