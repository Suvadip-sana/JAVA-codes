package com.company;

import java.util.ArrayList;

class generic<t1,t2>{
    int bob;
    private t1 T1;
    private t2 T2;

    public generic(int bob, t1 t1, t2 t2) { //Constructor

        this.bob = bob;
        this.T1 = t1;
        this.T2 = t2;
    }

    public int getBob() {
        return bob;
    }

    public void setBob(int bob) {
        this.bob = bob;
    }

    public t1 getT1() {
        return T1;
    }

    public void setT1(t1 t1) {
        T1 = t1;
    }

    public t2 getT2() {
        return T2;
    }

    public void setT2(t2 t2) {
        T2 = t2;
    }
}

public class j_112_generics {
    public static void main(String[] args) {
        /*
        ArrayList arrayList = new ArrayList();
        arrayList.add("str");
        arrayList.add(23);
        arrayList.add(453);

        int a =(int)arrayList.get(0);  // This produce a runtime error because we did not use generic here. in this case <Integer>
        System.out.println(a);
         */


        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add("str");  // It's give a compile time error for the generic
        arrayList.add(23);
        arrayList.add(453);

        int a =arrayList.get(0);
        System.out.println(a);
        generic <String, Integer> g1 = new generic(45,"Suvadip Sana, ",67);
        String g = g1.getT1();
        Integer h = g1.getT2();
        System.out.println(g + h);
    }
}
