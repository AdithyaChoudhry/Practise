package OOPS.Interfaces.Defaultnterface.Extendinterface;

//interface to interface we can inherit using extend
//class to interefaces we use implements
public interface B   {
    void Greet();
    //usage of default method before java8 if new method introduced in interface it should be implemented in all the classes
    //which are having the particular interfaces
    //to overcome this we use default method
    //if two default methods are there we should override it
    default void fun(){

    };

    //static methods in interface myst always have a body
    //use the name of interface to call it
    static void greet(){
        System.out.println("hello");
    }
}
