package com.company;

public class j_33_Array_pro6 {
    public static void main(String[] args) {
        // find max element
       /* int[] arr = { 1,2,34,56,78,94,100};
        int max = 0;
        for(int e : arr){
            if (e > max) {
                max = e;
            }
        }
        System.out.print("The value of the maximum element in this array is: "+ max);

        */

        // find min element
        int[] arr = { 1,2,34,56,78,94,100};
        int min = Integer.MAX_VALUE;
        for(int e : arr){
            if (min>e) {
                min = e;
            }
        }
        System.out.print("The value of the maximum element in this array is: "+ min);
    }
}
