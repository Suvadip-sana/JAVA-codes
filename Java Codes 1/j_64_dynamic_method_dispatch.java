package com.company;

class  phone{
    public void on(){  //on function
        System.out.println("Turning on Phone......");
    }
    public void showTime(){  //greet function
        System.out.println("Time is 8 am.");
    }
}
class  smartphone extends phone{
    public void on(){
        System.out.println("Turning on Smart Phone......");
    }
    public void music(){
        System.out.println("Playing music.");
    }
}
public class j_64_dynamic_method_dispatch {
    public static void main(String[] args) {
        //phone obj = new phone();
        //smartphone sObj = new smartphone();
        //obj.name();
        phone obj = new smartphone();   // allowed
        //smartphone obj2 = new phone();  // not allowed
        obj.showTime();
        obj.on();  // This is called dynamic method dispatch,When object is created it's create in runtime.
        //obj.music();//  Not allowed.
    }
}
