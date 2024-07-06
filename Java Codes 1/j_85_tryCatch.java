package com.company;

public class j_85_tryCatch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        //  WITHOUT TRY

//        int c = a/b;
//        System.out.println("The result is " + c);

        //  WITH TRY

        try {           //Try catch is used for handling the exception that arrived in program
            int c = a/b;
            System.out.println("The result is " + c);
        }
        catch(Exception e){
            System.out.print("We failed to divide. Reason:-> ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
