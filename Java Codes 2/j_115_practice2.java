package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class j_115_practice2 {
    public static void main(String[] args) {

        // Specify folder path.
        String folderPath = "C:\\Intellj IDEA codes\\MultiplicationTable";

        // Create a file object into this folder
        File newFolder = new File(folderPath);

        // Check the folder is already present or not, If not then print a conformation message.
        if(!newFolder.exists()){
            boolean folderCreated = newFolder.mkdirs();
            if(folderCreated){
                System.out.println("Folder created successfully.");
            }
            else {
                System.out.println("fail to create the folder");
                return;
            }
        }

        for( int i = 1; i <= 19; i++){
            generate$SaveTable(newFolder,i);
        }
        System.out.println("Multiplication Table generated and save successfully.");
    }

    private  static void generate$SaveTable(File newFolder, int number){
        // Create file object for the file into the folder
        File file = new File(newFolder, "MultiplicationTable_" + number + ".txt");
        try {
            // Write into  the file
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);

            for(int j  = 1; j <= 20; j++){
                pw.println(number + " x " + j + " = " + (number * j));
            }

            fw.close();
            pw.close();

            System.out.println("Multiplication table for " + number + " saved into this path --> " + file.getAbsoluteFile());

        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
            System.out.println("An error occurred while writing in this file, and the error is --> " + e);
        }

    }
}
