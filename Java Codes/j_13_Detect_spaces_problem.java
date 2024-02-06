package com.company;

public class j_13_Detect_spaces_problem {
    public static void main(String[] args) {
        String myString = "This String Contains  Double and triple spaces,";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}
