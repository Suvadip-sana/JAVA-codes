package com.company;
import  java.util.*;

public class j_95_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();  //Generic syntax. // This array list is the Integer's array list.
        ArrayList<Integer> l2 = new ArrayList<>(9);
        l1.add(7);
        l1.add(9);
        l1.add(2);
        l2.add(16);
        l2.add(19);
        l2.add(21);
        l1.add(5);
        l1.add(7);
        l1.add(2);

        l1.add(1,12); // Add element at index wise
        l1.add(1,13);
        l1.addAll(l2);  //Showcasing addAll method that append element at the end of the list.
//        l1.clear();
        System.out.println(l1.contains(45));// contains() method help to find the element from the array list.
        System.out.println(l1.indexOf(2));  //index of this element
        System.out.println(l1.lastIndexOf(2));  //last index of this element.
//        l1.set(1,456);
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i) + ","); //.get() method to get all arrayList element.
        }
//        System.out.println(l1.size());
    }
}
