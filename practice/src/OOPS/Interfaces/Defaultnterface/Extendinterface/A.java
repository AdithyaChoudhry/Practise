package OOPS.Interfaces.Defaultnterface.Extendinterface;

public interface A {
   default void fun(){

   };
   //usage of default method before java8 if new method introduced in interface it should be implemented in all the classes
   //which are having the particular interfaces
   //to overcome this we use default method
   //if two default methods are there we should override it
}
