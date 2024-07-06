package com.company;

public class j_08_04_grade_encryption {
    public static void main(String[] args) {
        //encryption
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);
        //decryption
        grade = (char)(grade-8);
        System.out.println("Here is the decryption: "+grade);

    }
}
