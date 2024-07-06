//Find the element is this present or not in array.
package com.company;

public class j_29_Array_pro2 {
    public static void main(String[] args) {
        int[] number = {34, 67, 86, 46, 24, 56, 49};
        int num = 86;
        boolean isInArray = false;
        for (int element : number) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray) {
            System.out.println("The value is present in the array.");
        }
        else{
            System.out.println("The value is not in the array.");
        }
    }
}
