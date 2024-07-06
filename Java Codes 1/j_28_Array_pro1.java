//Print the sum of the array.
package com.company;

public class j_28_Array_pro1 {
    public static void main(String[] args) {
        float[] marks = {43.6f,56.7f,56.8f,23.6f,98.6f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is: "+sum);
    }
}
