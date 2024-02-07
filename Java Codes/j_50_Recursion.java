package com.company;

public class j_50_Recursion {
    //For recursion method
    /*static  int factorial(int n){
        //Factorial(n) = n * n-1 * n-2 * n-3.........1
        // factorial(n) = n * factorial(n-1)
        //factorial(0) = 1

        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

     */
    //For iterative method
    static  int factorial_iterative(int n) {   //Factorial(n) = n * n-1 * n-2 * n-3.........1
        // factorial(n) = n * factorial(n-1)
        //factorial(0) = 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return  product;
        }
    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println("The value of factorial is: "+ factorial_iterative(x));

    }
}
