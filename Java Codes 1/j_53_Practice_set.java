package com.company;

// Problem 1: Two attribute and Three methods;
  /*
    class  employee1{
        int salary;
        String name;
        public int getSalary(){
            return  salary;
        }
        public String  getName(){
            return  name;
        }
        public void setName(String n){
            name = n;
        }
    }
public class Practice_set_53 {
    public static void main(String[] args) {
        //Problem 1
        employee1 suvadip = new employee1();  //Create an instance in employee
        suvadip.setName("Suvadip Sana");
        suvadip.salary = 443254;
        System.out.println(suvadip.getSalary());
        System.out.println(suvadip.getName());
    }
}
*/


//Problem 2:  Create a class cellphone with methods to print ringing, vibrating etc,

/*
class  cellPhone{
    public  void ring(){
        System.out.println("Ringing..............");
    }
    public  void vibrate(){
        System.out.println("Vibrating...........");
    }
    public void callFriend(){
        System.out.println("Vibrating..........");
    }
}
public class Practice_set_53{
    public static void main(String[] args) {
        cellPhone asus = new cellPhone();
        asus.callFriend();
        asus.ring();
        asus.vibrate();
    }
}

 */

//Problem 3: Create a class square with a method to initialize its side, calculating area, perimeter etc,

/*
class  Square{
    int side;
    public  int area(){
        return  side * side;
    }
    public  int perimeter(){
        return 4 * side;
    }
}
public class Practice_set_53{
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 8;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}

 */

//Problem 4: Create a class Tommy Vecetti for Rockstar Games capable of hitting(print hitting....),running, firing etc,

class tommy{
    public void hit(){
        System.out.println("Hitting the enemy......");
    }
    public void run(){
        System.out.println("Running from the enemy.......");
    }
    public  void fire(){
        System.out.println("Firing to the enemy.......");
    }
}

public class j_53_Practice_set{
    public static void main(String[] args) {
        tommy Player = new tommy();
        Player.hit();
        Player.run();
        Player.fire();
    }
}