package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class j_104_formatter {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now(); // This is the date
        System.out.println(ldt);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy --> E, H:m:s a");// Formatter
        String myDate = ldt.format(form);//Creating date string using date and format
        System.out.println(myDate);

        DateTimeFormatter form2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2 = ldt.format(form2);
        System.out.println(myDate2);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        DateTimeFormatter form3 = DateTimeFormatter.ISO_LOCAL_TIME;
        String myDate3 = ldt.format(form3);
        System.out.println(myDate3);


    }
}
