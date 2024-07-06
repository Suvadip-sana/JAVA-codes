package com.company;

interface  bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface  hornBicycle{
    void blowHorn3();
    void blowHorn2();
}

class  avonCycle implements bicycle,hornBicycle{
    void blowHorn(){
        System.out.println("Horn please");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup");
    }
    public void blowHorn3(){
        System.out.println("Kabhi khushi kabhi gum!");
    }
    public void blowHorn2(){
        System.out.println("Main hoon na!");
    }
}
public class j_68_interfaces {
    public static void main(String[] args) {
       avonCycle cycle = new avonCycle();
       cycle.applyBrake(1);
       // You can create properties in interfaces
        System.out.println(cycle.a);
        //You can not modify the properties in interfaces as they are final
        cycle.blowHorn3();
        cycle.blowHorn2();
    }
}
