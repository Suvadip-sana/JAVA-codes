package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class j_116_practice3 {
    public static void main(String[] args) {

        String path = "C:\\Intellj IDEA codes\\Multiplication";

        File folder = new File(path);

        if(!folder.exists()){
            boolean fCreated = folder.mkdirs();
            if(fCreated){
                System.out.println("Folder created successfully");
            }
            else {
                System.out.println("An error occurred.");
            }
        }
        for (int i = 2; i <= 9; i++){
            boba(folder, i);
        }
        System.out.println("Table created and saved successfully.");
    }

    private static void boba(File folder, int number){

        File file1 = new File(folder,"multiplication_" + number + ".txt");

        try {
            FileWriter fk = new FileWriter(file1);
            PrintWriter pk = new PrintWriter(fk);

            for (int j = 1; j <= 10; j++){
                pk.println(number + "x" + j + " = " + (number*j));
            }

            fk.close();
            pk.close();

            System.out.println("An file is created for the number " + number + " and the path is --> " + file1.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("An error occurred while writing into the file, and the error is: " + e);
            e.printStackTrace();
        }
    }
}
