package com.company;

class ekClass{
    int a;
    public int getA() {
        return a;
    }
    ekClass(int v){
        this.a = v; //'this' is a reference. if the variable name same inside method then its usage is display properly,
    }
    public  int returnOne(){
        return 1;
    }
}
class doClass extends ekClass{
    doClass(int c){
        super(c);
        System.out.println("I am a constructor.");
    }
}
public class j_62_this_super {
    public static void main(String[] args) {
        ekClass e = new ekClass(5);
        doClass d = new doClass(6);
        System.out.println(e.getA());
    }
}
