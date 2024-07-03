package OOPS.Abstractclasses;

public abstract  class Parent {
//using of final keyword
    final int value;

    public Parent(){
        value=90;//like this we can use the final method in abstract classes
    }

//to resolve multiplle inheritance we use abstract classes
    //abstract classes use only what method to use but not how to use it
    //only child have the body , parent have only the function
    //when the one or more functions are abstract it class must be also abstract
    public abstract  void carrear();
    public abstract  void Partner();
    //We cannot create abstract constructor though we want to call it here it must not be empty that is it must have the body
    //Similarly we cannot create objects for abstract class
    //we cannot create abstract static methods
    //but we can create static methods in abstract classes
    static void greeting(){
        System.out.println("i am greeted");
    }

    void normal(){
        System.out.println("i am normal");//we can ovverride this in child class
    }
}
