package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class j_101_calender {
    public static void main(String[] args) {
        Calendar d = Calendar.getInstance();
        System.out.println(d.getCalendarType());
        System.out.println(d.getTimeZone());
        System.out.println(d.getTime());

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());


    }
}
