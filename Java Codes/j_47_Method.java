package com.company;

public class j_47_Method {
    static  void change(int a){
        a = 98;
    }
    static  void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
            System.out.println("I invented a new word!\n"+"Plagiarism");
    }
    public static void main(String[] args) {
        //tellJoke();
        /*
        //Case 1 : Changing the integer
        int [] marks = {67,78,89,87,90,96};
        int x = 45;
        change(x);
        System.out.println("The value after running \"change\" is: "+ x);

         */
        //Case 2 : Changing the Array
        int [] marks = {67,78,89,87,90,96};
        change2(marks);
        System.out.println("The value after running \"change2\" is: "+ marks[0]);

        }
}
