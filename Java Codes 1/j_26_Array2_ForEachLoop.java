package com.company;

public class j_26_Array2_ForEachLoop {
    public static void main(String[] args) {
        int [] marks = {98,80,96,97,93,89};
        //float[] marks2 = { 89.5f,79.5f,89.2f,90.5f};
        //String[] students = { "ayan","barun","arun","tarun"};
        //System.out.println(students.length);
        System.out.println("Length of the array is: "+marks.length);

        //Array traversal:

        System.out.println("\nThe array elements are:");
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        //Array traversal in reverse order:

        System.out.println("\nThe array elements in reverse order:");
        for(int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //For-each loop

        System.out.println("Print the element using for each loop:");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
