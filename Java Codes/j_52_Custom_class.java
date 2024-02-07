package com.company;
class Employee{
    int id;
    String name;
    int salary;
    public  void printDetails(){
        System.out.println("My id is: "+ id );
        System.out.println("My name is: "+ name );
    }

    public int getSalary() {
        return salary;
    }
}
public class j_52_Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class,");
        Employee suva = new Employee();     //Instantiating a new object
        Employee avi = new Employee();     //Instantiating a new object
        //Setting attributes
        suva.id = 6;
        suva.salary = 34000;
        suva.name = "java";
        avi.id = 9;
        avi.salary = 24000;
        avi.name = "gamlachoda";
        //Printing the attributes
        //System.out.println(suva.id);
        //System.out.println(suva.name);
        suva.printDetails();
        avi.printDetails();
        int salary = suva.getSalary();
        System.out.println(salary);

    }
}
