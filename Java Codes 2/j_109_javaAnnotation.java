package com.company;

@FunctionalInterface
interface myFunction{
    void thisFunction();
//    void thisFunction2();
}
class newClass extends phone{
    @Override
    public void showTime(){
        System.out.println("The time is 8 pm");
    }

    @Deprecated
    public  int sum(int a, int b){
        return a + b;
    }
}

public class j_109_javaAnnotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        newClass Class = new newClass();
        Class .showTime();
        Class.sum(51,36);
    }
}
