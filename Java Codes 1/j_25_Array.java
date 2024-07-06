package com.company;

public class j_25_Array {
    public static void main(String[] args) {
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        int [] marks = new int[5];
        // 2. Declaration and then memory allocation
        // int [] marks;
        //initialization
        marks[0] = 89;
        marks[1] = 79;
        marks[2] = 88;
        marks[3] = 96;
        marks[4] = 90;
        // 3. Declaration, memory allocation and initialization together
        //int [] marks = {98, 45, 79, 99, 80};
        // marks[5] = 96; - throws an error
        System.out.println(marks[4]);

    }
}
