package com.company;

    class myMainEmployee{
        private int id;
        private String name;



       public myMainEmployee(){   //Constructor
           id = 89;
           name = "Your-name-here!";
       }
        public  myMainEmployee(String myName,int myId){   //Constructor with arguments
            id = myId;
            name = myName;
        }
        public  myMainEmployee(String myName){   //Constructor with arguments

           name = myName;
        }
        public  String getName(){
           return name;
       }
        public void  setName(String n){
           this.name = n;
       }
        public  int getId(){
           return id;
       }
        public  void setId( int i){
           this.id = i;
       }
    }

public class j_57_Constructors {
    public static void main(String[] args) {
        myMainEmployee suva = new myMainEmployee("CodeWithHarry",99);
        //myMainEmployee suva = new myMainEmployee();
        //suva.setId(56);
        //suva.setName("Suvadip Sana");
        System.out.println(suva.getId());
        System.out.println(suva.getName());
    }
}
