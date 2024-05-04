package com.company;

import java.util.LinkedList;

public class j_96_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(5);
        l1.add(34);
        l1.add(8);
        l1.add(52);
        l1.add(15);
        l1.add(31);
        l1.add(17);
        l1.add(9);
        l1.add(5);
        l1.add(2);

        l2.add(40);
        l2.add(34);
        l2.add(7);
        l2.add(10);
        l1.addAll(4,l2);
        l1.addFirst(123);
        l1.addLast(89);
        for (int i = 0; i< l1.size(); i++){
            System.out.print(l1.get(i) + ",");
        }
    }
}
