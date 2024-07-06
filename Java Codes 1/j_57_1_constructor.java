package com.company;

public class j_57_1_constructor {
    private String model;
    private int year;
        public j_57_1_constructor (String model, int year){  // Constructors
            this.model = model;
            this.year = year;
        }
        public  void printCarInfo(){   // Methods
            System.out.println("Car model: "+ model);
            System.out.println("Manufacturing Year: "+ year);
        }


    public static void main(String[] args) {
        j_57_1_constructor myGaddi = new j_57_1_constructor ("Toyota", 2023);
        myGaddi.printCarInfo();
    }
}
