package com.company;

public class j_99_date_time {
    public static void main(String[] args) {
        // It's count from 1970 1st january, and take 1900 as base reference.
        System.out.println("Number of year since 1970 are " + System.currentTimeMillis()/1000/3600/24/365 + " years.");
    }
}
