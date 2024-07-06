package com.company;

public class j_24_problem_loops {
    public static void main(String[] args) {

        /*Problem 1: Write a program to
        print a following pattern
        * * * * *
        * * * *
        * * *
        * *
        *

         */

//        int n = 20;
//        for(int i = n; i>0; i--){
//            for(int j = 0;j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//
//        }

        /*Problem 2: Write a program to sum
        first n numbers of even numbers using for loop
         */

//        int sum = 0;
//        int n = 3;
//        for(int i=0;i<n;i++){
//            sum = sum +(2*i);
//        }
//        System.out.println("Sum of even number: "+sum);

        /*Problem 3:Write a program to print
        multiplication table of a given number n,*/

//        int n = 10;
//        for(int i = 0;i<=n;i++){
//            System.out.printf("%d x %d = %d\n", n,i ,n*i);
//        }

        /*Problem 4:Write a program to print
        multiplication table of 10 in reverse order,*/

//        int n = 10;
//        for(int i = 10;i>=1;i--){
//            System.out.printf("%d x %d = %d\n", n,i ,n*i);
//        }

        /*Problem 5: Write a program to find
        factorial of a given number using while loop
         */
        //int n = 5;
        /*factorial:
        n = n * n-1 * n-2 * n-3 * n-4 *.........1
         */
        //int i =1;
        //int factorial = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

        //using for loop

//        for(i =1; i<=n;i++){
//            System.out.println(factorial *=i);
//        }

/*Practice problem 9: Write a program to calculate
 the sum of the numbers occuring
 in the multiplication table of 8
 */
//        int n = 8;
//        int sum = 0;
//        for(int i = 0;i<=10;i++){
//            sum += n*i;
//        }
//        System.out.println(sum);

        /*Problem 10: Write a program to sum
        first n numbers of even numbers using while loop*/

        int sum = 0;
        int n = 3;
        int i = 0;
        while(i<n){
            sum = sum +(2*i);
            i++;

        }
        System.out.println("Sum of even number: "+sum);

    }
}
