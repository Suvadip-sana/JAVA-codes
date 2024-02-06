//Calculate the average marks from an array containing marks of all students in phy using for each loop.
package com.company;

public class j_30_Array_pro3 {
    public static void main(String[] args) {
        float[] marks = {89.5f,78.5f,90.5f,94.5f,96.5f,93.5f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.print("The value of average marks is " + sum/ marks.length);
    }
}
