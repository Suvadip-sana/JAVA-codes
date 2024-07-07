package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class j_105_practiceSet {
    public static void main(String[] args) {
        // Question 1: Create an arrayList and store the names of ten students inside it, Print it using for loop.

        /*
        ArrayList ar = new ArrayList();
        ar.add("Stu 1");
        ar.add("Stu 2");
        ar.add("Stu 3");
        ar.add("Stu 4");
        ar.add("Stu 5");
        ar.add("Stu 6");
        ar.add("Stu 7");
        ar.add("Stu 8");
        for(int i = 0; i<ar.size(); i++){
            System.out.print(ar.get(i) + ", ");
        }

        System.out.println();

        //Using for each loop
        for(Object o : ar){
            System.out.print(o + "' ");
        }

         */

        // Question 2: Use the Date class in java to print the time in the following format: 1:39:58

        /*
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());
         */


        // Question 3: Repeat question 2 using the Calendar class.

        /*
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));
         */

        // Question 4: Repeat question number 2 using java.time API

        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s (a)");
        String st = lt.format(dtf);
        System.out.println(st);
        // Question 5: Create a set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored.

        /*
        HashSet<Integer> al = new HashSet();
        al.add(5);
        al.add(34);
        al.add(12);
        al.add(8);
        al.add(5);
        al.add(87);
        al.add(35);
        System.out.println(al);
         */



    }
}
