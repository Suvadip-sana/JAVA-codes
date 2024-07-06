package com.company;

import java.util.Scanner;

public class j_20_Find_Type_Of_Website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a website: ");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an Organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is an Commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }
        else{
            System.out.println("Please enter exist website");
        }
    }
}
