package com.company;

public class j_48_Methods_overloading {
    //Method overloading
    static void foo(){
        System.out.println("Good morning!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a,int b){ //Parameters
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    public static void main(String[] args) {
        foo();
        foo(80); //Arguments are actual
        foo(60,90);

    }
}
