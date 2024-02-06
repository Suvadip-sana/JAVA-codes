// Find the arr which is sorted or not
package com.company;

public class j_34_Array_pro7 {
    public static void main(String[] args) {
        int[] arr = { 1,2,34,64,78,94,};
        boolean isSorted = true;
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }else {
            System.out.println("The array is not sorted");
        }
    }
}
