package com.company;


class InvalidInputException extends Exception{
    public String toString(){
        return "Can't add 0 with 0.";
    }
    public String getMessage(){
        return "invalid input exception.";
    }
}
class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "Can't divide by 0.";
    }
    public String getMessage(){
        return "invalid input exception.";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Input can't be greater than 100000";
    }
    public String getMessage(){
        return "invalid input exception.";
    }
}
class MultiplyIndexException extends Exception{
    public String toString(){
        return "Input can't be greater than 7000 while multiplying.";
    }
    public String getMessage(){
        return "invalid input exception.";
    }
}
class CustomCalculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==0 || b==0){
            throw  new InvalidInputException();
        }
        return  a + b;
    }
    double subtraction(double a, double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return  a - b;
    }
    double multiplication(double a, double b) throws MaxInputException, MultiplyIndexException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000){
            throw  new MultiplyIndexException();
        }
        return a * b;
    }
    double division(double a, double b) throws CannotDivideByZeroException,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}



        /*
        Exercise 6: You have to create a custom calculator with following
                    operations:

                    1. + -> Addition
                    2. - -> Subtraction
                    3. * -> Multiplication
                    4. / -> Division
                    Which throws the following exception:
                    1. Invalid input Exception ex: 8 & 9
                    2. Cannot divide by 0 Exception
                    3. Max input Exception if any of the inputs is greater than 100000
                    4. Max Multiplier Reached Exception - Don't allow any multiplication
                       input to be greater than 7000.
         */
public class j_93_Custom_Calculator {
        public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MultiplyIndexException {
//        CustomCalculator c = new CustomCalculator();
//        c.add(0,0);
//            System.out.println(c);

        CustomCalculator d = new CustomCalculator();
//        d.division(6,0);
//        d.division(2000000000,3000);
        d.multiplication(30000,40);




    }
}
