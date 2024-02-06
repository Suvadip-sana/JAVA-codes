package com.company;

import java.util.Scanner;

public class j_18_Tax_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income per annum: ");
        float tax = 0;
        float income = sc.nextFloat();
        if(income <= 2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + 0.05f * (income-2.5f);
        }
        else if (income>5.0f && income<=10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income-10.0f);

        }
        System.out.println("Total tax paid by the employee is: "+tax);


    }
}
