package com.company;

class  circle{
    public  int radius;
    circle(){
        System.out.println("i am non param of circle");
    }
    circle(int r){
        System.out.println("I am parameterized constructor.");
        this.radius = r;
    }
    public  double area(){
        return  Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends  circle{
    public int height;
    Cylinder1(int r, int h){  //Constructors
        super(r);
        System.out.println("I am Cylinder parameterized constructor");
        this.height = h;
    }
    public  double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class j_66_Inheritance_constructors_problem_set {
    public static void main(String[] args) {
        // Problem 1: Create a clas circle and use inheritance to create another class cylinder from it
        Cylinder1 obj = new Cylinder1(12,4);
        //circle objC = new circle(12);
    }
}
