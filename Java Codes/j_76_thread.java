package com.company;

class MyThread1 extends Thread{
    public void run(){    // run method
        int i = 0;
        while (i<400){
            System.out.println("My Cooking Thread is running.");
            System.out.println("I am happy.");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("My Thread2 for chatting with her.");
            System.out.println("I am sad.");
            i++;
        }
    }
}

public class j_76_thread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start(); //to start the thread method run the start method, it,s call everything inside thread class automatically.
        t2.start();
    }
}
