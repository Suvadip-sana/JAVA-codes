package com.company;

/*Problem 1: Create an abstract class pen  with methods
                     write() and refill() as abstract methods.
                     use the pen class to create a concrete class fountain pen with
                     additional method changeNib();.
                     */
abstract  class Pen{
    abstract void write();
    abstract void refill();
}
/* use the pen class from Q1 to create a concrete class fountain pen with
additional method changeNib();.
 */
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Change the Nib");
    }
}

/*
Problem 2: Create a class Monkey with jump() and bite() methods. Create a class
           Human which inherits this Monkey class and implements BasicAnimal interface
           with eat() and sleep() methods.
 */

class Monkey{
    void jump(){
        System.out.println("Jumping.....");
    }
    void bite(){
        System.out.println("Biting......");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping.....");
    }
}

/*
Problem 4: Create a class Telephone with ring(),lift() and disconnect() methods
as abstract methods. Create another class SmartPhone and demonstrate polymorphism.
 */
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
interface MyCamera3 {
    void takeSnap();

    void recordVideo();
    private  void greet(){
        System.out.println("Good night.");
    }
    default void greet2(){
        greet();
    }
}
class SmartPhone extends Telephone implements MyCamera3{
    void gps(){
        System.out.println("GPS is on now.");
    }
    void ring(){
        System.out.println("Ringing......");
    }
    void lift(){
        System.out.println("Lifting the phone.");
    }
    void disconnect(){
        System.out.println("Disconnect the phone.");
    }
    public void takeSnap(){
        System.out.println("Taking snap.");
    }
    public void recordVideo(){
        System.out.println("Recording video......");
    }

}
public class j_72_abstractClass_interface_problem {
    public static void main(String[] args) {
        //Problem 1:
        /*FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

         */
        //Problem 2:
        /*Human h = new Human();
        h.speak();
        h.eat();
        h.sleep();
         */
       /*
        //Problem 3: Demonstrate polymorphism using Monkey class from Q2
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        //m1.speak();  //Cannot use speak method because the reference is monkey which does not have speak method.
        BasicAnimal rup = new Human();
        //rup.speak(); // -----> Error.
        rup.eat();
        rup.sleep();
        */
        //Problem 4:
        MyCamera3 mc = new SmartPhone();
        mc.takeSnap();
        mc.recordVideo();
        mc.greet2();
        //mc.gps():// Can not use gps method because the reference is MyCamera3 which does not have gps method.
        SmartPhone sp = new SmartPhone();
        sp.gps();
        sp.ring();
        sp.lift();
        sp.disconnect();
    }
}
