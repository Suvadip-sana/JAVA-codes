package com.company;

/**
 * This is to demonstrate what javadoc is and how it is used in the java industry.
 * @author Suvadip
 * @version 0.1
 * @since 2023
 * @see <a href="https://docs.oracle.com/en/java/javase/20/docs/api/index.html" target="_main" >java Docs</a>
 */

public class j_107_javadoc {
    public  int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("This is the main method.");
        j_107_javadoc ja = new j_107_javadoc();
        int quick = ja.add(20,35);
        System.out.println(quick);
    }
}
