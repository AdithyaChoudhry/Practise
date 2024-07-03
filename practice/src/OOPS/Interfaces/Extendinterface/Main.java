package OOPS.Interfaces.Extendinterface;
//interface to interface we can inherit using extend
//class to interefaces we use implements

public class Main implements B{//here we implement B which extend A
    @Override
    public void Greet(){//b have only greet but due to inherited A we ca also use the function of A here

    }

    @Override
    public void fun(){

    }
}
