package com.company;

import org.w3c.dom.ls.LSOutput;

abstract class  parent{
    public  parent(){
        System.out.println("I am the constructor of base 2");
    }
    public  void  sayHello(){
        System.out.println("Hello");
    }
    abstract  public void greet();  //abstract method
    abstract  public void greet2();
}

class  child1 extends parent{      //concrete class which create object
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
    public void greet2() {
        System.out.println("Good afternoon");
    }
}
abstract class child2 extends  parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class j_67_abstract {
    public static void main(String[] args) {
        //parent p = new parent();
        child1 c = new child1();
        //child2 c1 = new child2();
    }
}
