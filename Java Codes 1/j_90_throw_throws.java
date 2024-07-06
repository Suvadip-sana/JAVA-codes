package com.company;

class  NegativeRadiousException extends Exception{
    public String toString(){
        return "radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "radius can't be negative";
    }
}
public class j_90_throw_throws {
    public static double area(int r) throws  NegativeRadiousException{
        if(r<0){
            throw new NegativeRadiousException();
        }
        double results = Math.PI * r * r;
        return results;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        // Made by one
        int results = a / b;
        return results;
    }

    public static void main(String[] args) {
        // Used by another one.

        try {
            int c = divide(6, 2);
            System.out.println(c);


            double b = area(2);
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("An exception occur");
        }

    }
}
