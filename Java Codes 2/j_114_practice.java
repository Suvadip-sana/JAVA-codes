package com.company;

import java.io.FileWriter;
import java.io.IOException;

class depri{
    @Deprecated
    public void method1(){
        System.out.println("This is method 1.");
    }
}
interface inter{
    void display();
}
public class j_114_practice {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
      // Question 1 --> Create a javadoc from a java program using and without using Intellij Idea.

        // Question 2 --> Create a class and add a method with deprecated annotation. What is it effect on program execution.
        /*
        depri d = new depri();
        d.method1();
         */

        // Question 4 --> Create an interface and generate an instance from it.

        /*
        inter t = new inter() {
            @Override
            public void display() {
                    System.out.println("This is displaying");
            }
        };
         */

        // Question 5 --> Create a multiplication table of a given number and write it to a file.

        int i = 19;
        String tb = "";
        for(int j = 0; j < 10; j++){
            tb += i + "X" + (j+1) + "=" + i*(j+1);
            tb += "\n";
        }

        try {
            FileWriter writeFile = new FileWriter("MultiplicationTable.txt");
            writeFile.write(tb);
            writeFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
