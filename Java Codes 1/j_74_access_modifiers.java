package com.company;

class c1{
    public  int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 678;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class j_74_access_modifiers{
    public static void main(String[] args) {
        c1 c = new c1();
        //c.meth(); // Demonstrate that in the same class all modifier can be usable
        /*
        //Demonstrate that in same package all modifier can be usable except privet modifier
         */
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);


    }
}
