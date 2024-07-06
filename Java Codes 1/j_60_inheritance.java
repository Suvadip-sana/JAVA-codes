package com.company;

class  base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class  derived extends base{  //inheritance (extend keyword)
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class j_60_inheritance {
    public static void main(String[] args) {
        //Creating an object of base class.
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());
        //Creating an object of derived class.
        derived d = new derived();
        d.setX(4);
        System.out.println(d.getX());
        //b.printMe();

    }
}
