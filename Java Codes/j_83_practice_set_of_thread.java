package com.company;

class MyThread0 extends Thread{
    public void run(){  //Question 1
        int i = 0;
        while(i<100){
//            try { // Question 2
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Good morning");
            i++;
        }
    }
}
class MyThread01 extends  Thread{ //Question 1
    public void run(){
        int i = 0;
        while(i<100){
//            try {   //Question 2
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Welcome");
            i++;
        }
    }
}
public class j_83_practice_set_of_thread {
    public static void main(String[] args) {
        /*
        Question 1: Write a program to print "good morning" and "welcome"
        continuously on the screen in java using Threads
         */
//        MyThread0 t1 = new MyThread0();
//        MyThread01 t2 = new MyThread01();
//        t1.start();
//        t2.start();
        /*
        Question 2: Add a sleep method in welcome thread of Question 1 to
        delay its execution for 200se.
         */
//        MyThread0 t1 = new MyThread0();
//        MyThread01 t2 = new MyThread01();
//        t1.start();
//        t2.start();
        /*
        Question 3: Demonstrate getPriority() and setPriority() methods in java
        threads
         */

//        MyThread0 t1 = new MyThread0();
//        MyThread01 t2 = new MyThread01();
//        t1.setPriority(8);
//        t2.setPriority(4);
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        t1.start();
//        t2.start();

        /*
        Question 4: How do you get state of a given Thread in java
         */

//        MyThread0 t1 = new MyThread0();
//        MyThread01 t2 = new MyThread01();
//        System.out.println(t2.getState());

        /*
        Question 5: How do you get reference to the current thread in java?
         */

        MyThread0 t1 = new MyThread0();
        MyThread01 t2 = new MyThread01();
        System.out.println(Thread.currentThread().getState());

        



    }
}
