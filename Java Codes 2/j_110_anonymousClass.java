package com.company;

interface demo{
    void method1();
    void method2();
}

//class anonymousC implements demo{
//
//    @Override
//    public void method1() {
//        System.out.println("This is the first method from method 1");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("This is the second method from method 2");
//    }
//}

public class j_110_anonymousClass {
    public static void main(String[] args) {


//        demo d = new anonymousC();
//        d.method1();
//        d.method2();


        demo obj = new demo() {   // After creating a reference of the interface. This is an anonymous class instead of implementing interface in another class
            @Override
            public void method1() {
                System.out.println("This is the first method from method 1 by creating anonymous class.");
            }

            @Override
            public void method2() {
                System.out.println("This is the first method from method 2 by creating anonymous class.");
            }
        };
        obj.method1();
        obj.method2();
    }
}
