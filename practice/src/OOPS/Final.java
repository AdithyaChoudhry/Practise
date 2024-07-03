package OOPS;

public class Final {
    public static void main(String[] args) {
        //When we use final we cannot change the value further
        //Always initialize the final while declaring

        //only the values of primitive data types cannot be changed
        //final int a = 9;

        //Object values of non primitive data types can be modified but cannot reassign it
        final A Ram = new A("Ram");
        //we can change the value of object but cant reassign it
        Ram.name="Raj";
        System.out.println(Ram.name);
        //We cannot do reassign like this anywhere
        // Ram = new A()

    }
}
class A{
    String name;
A(String ram){
    this.name=name;

}
}

