package OOPS.Interfaces.NestedInterface;

public class Main {
    //Nessted interfaces can use private
    //top level interfaces can use public or default
    public static void main(String[] args) {
        A obj = new A();

        System.out.println(      obj.isodd(7));
    }
}
