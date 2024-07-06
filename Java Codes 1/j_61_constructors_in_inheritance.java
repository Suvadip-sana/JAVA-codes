package com.company;


class base1{
    base1(){
        System.out.println("I am a base class constructors.");
    }
    base1(int x){
        System.out.println("I am an overloaded constructors with value of x as: " + x);
    }

}
class derived1 extends base1{
    derived1(){
        //super(0); // for call the base1 class constructor with argument use 'super' keyword.
        System.out.println("I am a derived class constructors.");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructors of derived1 class with value of y as: " + y);
    }

}
class  childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I am childOfDerived class constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructors of childOfDerived class with value of z as: " + z);
    }
}
public class j_61_constructors_in_inheritance {
    public static void main(String[] args) {
        base1 b = new base1();
        derived1 d = new derived1();
        derived1 e = new derived1(14,8);
        childOfDerived cd = new childOfDerived();
        childOfDerived qd = new childOfDerived(12,24,76);

    }
}
