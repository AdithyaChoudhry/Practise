package OOPS.Interfaces.NestedInterface;

public class B {
    public interface NestedInterface{
        boolean isodd(int num);
    }
}

//if we use public class A it should be declared in another file name as A.java
class A implements B.NestedInterface {

    @Override
    public boolean isodd(int num) {
        return (num % 2)==1 ;
    }
}
