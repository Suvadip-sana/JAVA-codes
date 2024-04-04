package com.company;

import java.util.Scanner;

class MyException extends  Exception{
    @Override
    public String toString() {
        return  "I am toString";
    }

    @Override
    public String getMessage() {
        return  "I am getMessage";
    }
}
class MyAgeException extends  Exception{
    @Override
    public String toString() {
        return  "Age can't be greater than 125";
    }

    @Override
    public String getMessage() {
        return  "Make sure that the value of age entered is correct";
    }
}
public class j_89_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        if(a<9){
            try {
//                throw  new MyException();
                throw  new ArithmeticException("This is an exception");  // Throw an exception inside the try catch is a good practice,
            }
            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();// Find the error at which line it's arrived.
                System.out.println("I am still running");
            }
            System.out.println("Yes, I am still running.");
        }
    }
}
