package com.company;

public class j_108_methodTags {
    /**
     *
     * @param args This is the arguments supplied to the command line.
     */
    public static void main(String[] args) {
        System.out.println("This is the main method.");
        j_108_methodTags ja = new j_108_methodTags();
        int quick = ja.add(34, 35);
        System.out.println(quick);
    }

    /**
     *
     * @param a This is the first number to add.
     * @param b This is the second number to add.
     * @return This return sum of two number as Integer.
     * @throws Exception if i is 0.
     * @deprecated
     */
    public int add(int a, int b){
        return a + b;
    }
}
