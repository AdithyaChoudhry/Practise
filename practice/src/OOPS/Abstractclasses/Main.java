package OOPS.Abstractclasses;

public class Main {
    public static void main(String[] args) {
        Son obj1 = new Son();
        obj1.carrear();
        obj1.Partner();
        Daughter obj2 = new Daughter();
        obj2.carrear();
        obj2.Partner();

        //We cannot create abstract constructor though we want to call it here it must not be empty that is it must have the body
        //Similarly we cannot create objects for abstract class
        //we cannot create abstract static methods
        //but we can create static methods in abstract classes
        Parent.greeting();
    }

}
