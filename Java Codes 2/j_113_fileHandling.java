package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class j_113_fileHandling {
    public static void main(String[] args) {



        // Creating a new file.

        File myFile = new File("file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
//            e.printStackTrace();
        }


        /*

        // Write a file

        try {
            FileWriter fileWriter = new FileWriter("j_113_fileHandling.txt");
            fileWriter.write("This is the message for demonstrating the File handling in java for writing something into the file.\n Ok! That's it.");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */


        /*

        // Reading a file

        File myFile1 = new File("j_113_fileHandling.txt");
        try {
            Scanner sc = new Scanner(myFile1);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

         */

        /*

        // Deleting a file

        File myFile = new File("j_113_fileHandling.txt");
        if(myFile.delete()){
            System.out.println("Successfully deleted file is: " + myFile.getName());
        }
        else {
            System.out.println("Sum error occurred");
        }
         */

    }
}
