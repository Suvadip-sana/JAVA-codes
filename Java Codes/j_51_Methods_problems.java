package com.company;

public class j_51_Methods_problems {
    //Problem 1: Write a java method to print multiplication table of a number n
    /*
    static void multiplication(int n){
        for(int i =1;i<=10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        multiplication(7);

    }

     */


    /* Problem 2: write a program to print following patterns
    *
    * *
    * * *
    * * * *
     */
    /*static  void pattern1(int n){
        for(int i = 0;i<n;i++){      // Print the rows
            for(int j=0;j<i+1;j++){   // Print the number of stars in every rows
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pattern1(50);
    }

     */

    //Problem 3: Write a recursive function to calculate sum of first n natural numbers

    /*
    //sum(n) = 1 + 2 + 3 + .... + n-1 + n
    //sum(n) = sum(n-1) + n
    static  int sumRec(int n){
        if(n==1){  //base condition
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static void main(String[] args) {
        int c = sumRec(4);
        System.out.println(c);
    }

     */

    /*Problem 4: write a program to print following patterns
        * * * *
        * * *
        * *
        *
    */

    /*static  void pattern1(int n){
        for(int i = n;i>0;i--){      // Print the rows
            for(int j=0;j<i;j++){   // Print the number of stars in every rows
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pattern1(5);
    }

     */

    //Problem 5: Write a function to print nth term of fibonacci series using recursion

    //fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    /*static  int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        int results = fib(5);
        System.out.println(results);
    }

     */

    //Problem 6: Write a function to find average of a set of numbers passed as arguments



    //Problem 7: Repeat problem 2 using recursion

    static  void pattern1_recursion(int n){

        if (n>0){
            pattern1_recursion(n-1);
            for(int i=0;i<n;i++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1_recursion(6);
    }

// Problem 8: Write a function to convert Celsius temperature into fahrenhite

}
