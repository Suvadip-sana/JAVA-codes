package com.company;

class MyThr2 extends Thread{
    public MyThr2(String name){  //constructor
        super(name);
    }
    public void run(){
        int i = 0;
        while (i<100){
            System.out.println("Thank you: " + this.getName());
            i++;
        }
//        System.out.println("Thank you: " + this.getName());
    }
}
public class j_81_thread_priorities {
    public static void main(String[] args) {
        MyThr2 t1 = new MyThr2("Suvam1");
        MyThr2 t2 = new MyThr2("Suvam2");
        MyThr2 t3 = new MyThr2("Suvam3");
        MyThr2 t4 = new MyThr2("Suvam4");
        MyThr2 t5 = new MyThr2("Suvam5(most Importent)");
        MyThr2 t6 = new MyThr2("Suvam6");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
