package com.company;

class myEmployee{
    private int id;
    private String name;

    public  String getName(){
        return name;
    }
    public void  setName(String n){
        name = n;
    }
    public  int getId(){
        return id;
    }
    public  void setId( int i){
        id = i;
    }
}
public class j_54_Access_modifier {
    public static void main(String[] args) {
      myEmployee suvadip = new myEmployee();
      //suvadip.id = 45;
      //suvadip.name = "My name is Sanaya Malhotra";  //-----> Throws an error dew to private access modifier,
       suvadip.setName("Suvadip Sana");
        System.out.println(suvadip.getName());
    }
}
