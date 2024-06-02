package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class j_100_dateClass {
    public static void main(String[] args){
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        //Deprecated 'Date' class

        /*
        Date d = new Date();
        System.out.println("Current date and time is: " + d);
        */


        long m = System.currentTimeMillis();
        Date d = new Date(m);
        System.out.println(d);
        System.out.println(m);
        System.out.println(d.getTime());
        System.out.println(d.getSeconds());
        System.out.println(d.getDate());
        System.out.println(d.getYear());

        // (SimpleDateFormat) -> it's not thread safe. Available since the early version of java
        /*
        Date v = new Date();
        SimpleDateFormat df = new SimpleDateFormat("EEE, d MMM yyyy [HH:mm:ss]");
        String fd = df.format(v);
        System.out.println("Current date and time is: " + fd);
         */

        // (DateTimeFormatter) -> It's introduce in java 8. it's classes are immutable thus it's thread safe.
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy [HH:mm:ss]");
        String fd = currentDate.format(formatter);
        System.out.println("Current date and time is: " + fd);

        //java.time package.

        /*

        // Default constructor(LocalDate)

        LocalDate c = LocalDate.now();
        System.out.println("Today's date is: " + c);
         */

        /*

        // Parameterized constructor

        LocalDate m = LocalDate.of(2024,3,3);
        System.out.println(m);
         */

        /*
        // (LocalDateTime)
        LocalDateTime ct = LocalDateTime.now();
        System.out.println(ct);
         */

        //Parameterized constructor(LocalDateTime)
//        LocalDateTime ct = LocalDateTime.of(2024,3,3,2,5);
//        System.out.println(ct);
    }
}
