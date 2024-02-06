package com.company;

public class j_15_logical_op {
    public static void main(String[] args) {


        boolean a = true;
        boolean b = false;

        //logical AND
        System.out.println("For logical AND\n");
        if( a&&b ){
            System.out.println("Yes\n");
        }
        else{
            System.out.println("False\n");
        }

        //logical OR
        System.out.println("For logical OR\n");
        if( a||b ){
            System.out.println("Yes\n");
        }
        else{
            System.out.println("False\n");
        }

        //logical not
        System.out.println("For logical NOT\n");
        System.out.println("Not (a) is \n");
        System.out.println(!a+"\n");
        System.out.println("Not (b) is \n");
        System.out.println(!b+"\n");

    }
}
