package OOPS.Interfaces.Defaultnterface.Extendinterface;
//interface to interface we can inherit using extend
//class to interefaces we use implements

public class Main implements A, B {//here we implement B which extend A
    @Override
    public void Greet(){//b have only greet but due to inherited A we ca also use the function of A here

    }
    @Override//override is also interface
    public void fun(){}

   //usage of default method before java8 if new method introduced in interface it should be implemented in all the classes
    //which are having the particular interfaces
    //to overcome this we use default method
    //if two default methods are there we should override it
   public static void main(String[] args) {
       B.greet();//static method must have body and call via the inerface name
   }
}
