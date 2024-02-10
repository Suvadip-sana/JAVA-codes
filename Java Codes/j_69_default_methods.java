package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private  void greet(){  // Did not use this method directly,You can call through default methods.
        System.out.println("Good night.");
    }
    default void record4KVideo(){//Default method in interface
        greet();
        System.out.println("Recording in 4K......");
    }
}
interface  MyWifi{
    String[] getNetwork();

    void connectToNetwork(String network);
}
class  MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }
//    void takeSnap()
//    {
//        System.out.println("Taking snap");
//    }
}

class mySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap.");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
//    public void record4KVideo(){
//        System.out.println("Taking snap and recording in 4K");
//    }
    public  String[] getNetwork(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Harry","Prashant","Anjali"};
        return networkList;
    }
    public  void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class j_69_default_methods {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        ms.record4KVideo();
        String[] ar = ms.getNetwork();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
