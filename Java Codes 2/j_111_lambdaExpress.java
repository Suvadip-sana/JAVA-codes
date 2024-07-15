package com.company;

@FunctionalInterface
interface  anonymous{
    void Horn1(int a);
//    void Horn2();
}


/*
class suva implements anonymous{
    public void Horn1(){
        System.out.println("This is the method 1 from suva class where implement interface from anonymous class.");
    }
}
 */



public class j_111_lambdaExpress {

    public static void main(String[] args) {


//        anonymous a = new suva();
//        a.Horn1();


        anonymous obj = (a)->{  // Demonstration of Lambda Expression.
            System.out.println("This is the method 1 by implement interface from anonymous class using 'Lambda Expression'. and the number is: " + a);
        };
        obj.Horn1(9);



    }
}
