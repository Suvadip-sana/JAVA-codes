package com.company;
import java.util.Scanner;
public class j_04_Calculate_percentage {
    public static void main(String[] args) {
        System.out.println("|| - Enter All 7 subjects marks - ||");
        Scanner sc = new Scanner(System.in);
        System.out.print("      Enter your Bengali number: ");
        int ben = sc.nextInt();
        System.out.print("      Enter your English number: ");
        int eng = sc.nextInt();
        System.out.print("      Enter your Math number: ");
        int mat = sc.nextInt();
        System.out.print("      Enter your Physics number: ");
        int phy= sc.nextInt();
        System.out.print("      Enter your Chemistry number: ");
        int chem = sc.nextInt();

        int total = ben + eng + mat + phy + chem;

        float average = (ben + eng + mat + phy + chem)/5.0f;

        float percentage = (total/500.0f)*100;

        System.out.println("     Out of 500, Your total number is: "+total);
        System.out.println("     Your Average number is: "+average);
        System.out.println("     Your Percentage is: "+percentage);





    }
}
