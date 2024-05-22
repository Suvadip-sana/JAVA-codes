package com.company;

import java.util.ArrayDeque;

public class j_97_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(23);
        l1.add(33);
        l1.add(43);
        l1.add(53);
        l1.add(63);
        l1.addFirst(100);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

    }
}
