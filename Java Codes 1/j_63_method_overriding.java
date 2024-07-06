package com.company;

class  A{
    public int a;
    public  int avi1(){

        return 4;
    }
    public  void avi2(){

        System.out.println("I am avi 2 of class A");
    }
}
class B extends A{
    @Override
    public void avi2(){   //method overriding

        System.out.println("I am avi 2 of class B");
    }
    public void avi3(){

        System.out.println("I am avi 3 of class B");
    }
}
public class j_63_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.avi2();

        B b = new B();
        b.avi2();
    }
}
