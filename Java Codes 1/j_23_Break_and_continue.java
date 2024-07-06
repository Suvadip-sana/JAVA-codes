package com.company;

public class j_23_Break_and_continue {
    public static void main(String[] args) {

        //For Break Statement

//        for(int i = 0; i<5; i++){
//            System.out.println(i);
//            System.out.println("Fuck you!");
//            if(i==2){
//                System.out.println("Ending the loop.");
//                break;
//            }
//        }

        //For continue statement

        for (int i = 0; i < 20; i++) {
            if (i == 2) {
                System.out.println("OK! Go on.");
                continue;
            }
            System.out.println(i);
            System.out.println("Fuck you!");
        }

    }
}

