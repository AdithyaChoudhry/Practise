package OOPS.inheritance;

public class Main {
    public static void main(String[] args) {
        //normal object creation
        Inheritance obj1 = new Inheritance(3,4,5);
        System.out.println(obj1.w+ "  " + obj1.l + " " + obj1.h);

        //Inheritance
        Inherited obj2 = new Inherited(3,7);
        //here the height and width are inherited from the base class that is parent class to child class
        System.out.println(obj2.h +"  " + obj2.w + " " + obj2.h);

        //constructor inherited values of superclass
        Inherited obj3 = new Inherited(7,8);
        System.out.println(obj3.h + " " + obj3.l +" " + obj3.w + " " +obj3.weight);

        //here refernce is made to the super class but the object is created to subclass below one
        //here we can access only the objects in the reference class not in the object created class that is subclass
        //it can access only the obects of super class that is refernce variable
        Inheritance obj4 = new Inherited(5,6,7,8);

        //static so no need of objects  cannot be overriden but can be inherited
        Inheritance.greeting();
        Inherited.greeting();

        //we can only print objects in reference class like l, w , h and not the weight which is in subclass

        //-----------

        //we can reference a child class and create oject in superclass
        //it is only used to initialise it ,// though we are referencing a subclass we can access only the varaibles in subclass
        //but we are referencing a child to a parent it is not possible because child classes know what are above
        //but parent classes dont know what are below ,that is parent class has no idea about the variables in the chld class
        //hence it gives error when we do it like the below one

       //ERROR: Inherited obj5 = new Inheritance(3,4)


        //MultilevelInheritance
        MultilevelInherit obj5 = new MultilevelInherit();

        //----
        //-------There is no multiple inheritance in java because if 2 variables aree refering to the same variable ambiguity occurs so it is not possible
        //we can make it with use of interfaces and abstract classes

        //hierachial inheritace is were one class is inherited by many other classes

        //hybrid inheritance is not in java because , it is commbination of both single and multiple inheritance as there is no multiple inheritance in java
        // it is done using abstract classes and interfaces
    }
}
