package com.company;

class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (true ) {
            System.out.println("My Thank you");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            i++;
        }
    }
}

    class MyThrea extends Thread {
        public void run() {
            int i = 0;
            while(i<5000) {
                System.out.println("Thank you");
                i++;
            }
        }
    }

    public class j_82_thread_methods {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            MyThrea t2 = new MyThrea();
            t1.start(); // Start method
//        t1.join();// Throws an error , Need to handel interop exception
//            try {
//                t1.join(); // join method
//            } catch (Exception e) {
//                System.out.println(e);
//            }
            t2.start();
        }
    }

