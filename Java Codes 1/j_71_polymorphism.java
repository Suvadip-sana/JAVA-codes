package com.company;


interface MyCamera2{
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
interface  MyWifi2{
    String[] getNetwork();

    void connectToNetwork(String network);
}
class  MyCellPhone2{
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

class mySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
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
    public void sampleMeth(){
        System.out.println("Meth");
    }
}

public class j_71_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new mySmartPhone2(); //This is a smartphone but use it as a camera.
        //cam1.getNetwork(); //-----> Not allowed
        //cam1.sampleMeth;  //------> Through an error
        cam1.record4KVideo();
        mySmartPhone2 s = new mySmartPhone2();
        s.sampleMeth();
        s.getNetwork();
        s.recordVideo();
        s.takeSnap();
        String[] a = s.getNetwork();
        for (String item: a){
            System.out.println(item);
        }
        s.callNumber(889898989);
        s.pickCall();

    }
}
