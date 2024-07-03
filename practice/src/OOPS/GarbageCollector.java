package OOPS;

public class GarbageCollector {
    public static void main(String[] args) {
        //When we use final we cannot change the value further
        //Always initialize the final while declaring

        //only the values of primitive data types cannot be changed
        //final int a = 9;

        //Object values of non primitive data types can be modified but cannot reassign it
        final B Ram = new B("Ram");
        //we can change the value of object but cant reassign it
        Ram.name="Raj";
        System.out.println(Ram.name);
        //We cannot do reassign like this anywhere
        // Ram = new A()

        B object;
        for(int i=0; i< 1000000;i++){
                   object = new B("Random");
        }

    }
}
class B{
    String name;
    B(String name){
        this.name=name;

    }
//In java itself destroys the unwanted values automatically
    //we cant delete it by ourselves but we can make what to do when java is deleting it
    @Override
    protected void finalize() throws Throwable {
        //Go and create a obj with same refernce variable referring  to object many times as only once it can be referred
        System.out.println("objects destroyed");
    }
}

