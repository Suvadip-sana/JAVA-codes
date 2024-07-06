package com.company;

class MyThr extends  Thread{
    public MyThr(String name){    //constructor of MyThr class.it takes a 'string' parameter 'name' and calls the constructor of superclass 'Thread' using 'super(name)'
        super(name);
    }
    public  void run(){   // run method
        System.out.println("Thank You");
//        int i = 5;
//        while (true){
//            System.out.println("I am thread");
//        }
    }
}
public class j_80_thread_constructor {
    public static void main(String[] args) { //main method,it takes an array of strings as its parameter
        MyThr t1 = new MyThr("Suvadip"); //instance of the 'MyThr' class are created with name 'Suvadip'
        MyThr t2 = new MyThr("Harry");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The name of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());
    }
}
