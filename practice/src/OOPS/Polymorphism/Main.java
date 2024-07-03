package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
       // Square square = new Square();
  //-----
//-----

        shape.area();
        circle.area();
        rectangle.area();
        //square.area();

        //but if we print like this
        //it runs the object side one
        //basically the reference type mention which one to access
        //and the object type mention which one to run this is why if we change the reference type it runs the object side
        //this happens when we have parent reference type and child object as below this is known as upcasting
        //all these done by overrding
        Shapes square = new Square();
        square.area();//It still prints the square thing
    }
}

//there are different types of polymorphism
//1.-Compiletime / static polymorphism
//here it represents the method overloading as there is no operator overloading in Java
//method overloading represents --> different arguments , types , return , ordering that is multiple constructors


//2.-runtime /\dynamic polymorphism
//done by method overriding
//dynamic method dispatch -- determines which one to run while runtime that is
// when superclass type refer to the subclass oject (upcasting ) overriding occurs
//the super class is present to which one to access but not which one to run that is for example area
// area is the thing we want to access if we remove the area in superclass as we are calling the area in subclass
//it will not work because we are accessing the area , but which one it is decided by java during runtime by the object
//this is dynamic method dispatch

//Early binding --since final method cannot be overriden a call to one which is at compile time only this is called as early binding
//late binding is that if happens at run time that is overriding decides which one to run at the run time
