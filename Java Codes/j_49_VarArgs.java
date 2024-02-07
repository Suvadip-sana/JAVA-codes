package com.company;

public class j_49_VarArgs {
    /*
    static  int sum(int a, int b){
        return  a+b;
    }
    static  int sum(int a, int b,int c){
        return  a+b+c;
    }
    static  int sum(int a, int b,int c,int d){
        return  a+b+c+d;
    }
    */
    // This problem Solved in Varargs------>>
    static int sum(int x,int ...arr){   //Here int x means atLeast one argument is passing;
        //Available as int[] arr;
        int result = x;
        for(int a: arr){   //Foreach loop
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        //System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of the 4 and 9 is: " + sum(4,9));
        System.out.println("The sum of the 4, 9 and 8 is: " + sum(4,9,8));
        System.out.println("The sum of the 4, 9, 8 and 10 is: " + sum(4,9,8,10));
        System.out.println("The sum of the 4, 9, 8, 10 and 6 is: " + sum(4,9,8,10,6));

    }
}
