package com.company;

public class j_46_Methods {
    // 1 methods
    static  int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y) * 5;
        }
        return z;
    }
    // 1
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c;
        c = logic(a,b);
        //Method call using Object creation,(*then static is not add)
        /* Methods_46 obj = new Methods_46();
        c = obj.logic(a,b);
        */
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
