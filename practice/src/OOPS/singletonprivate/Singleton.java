package OOPS.singletonprivate;

public class Singleton {
    //it is private so the constructor cannot be accessed outside the file
    private Singleton(){

    }

    //make the class instance to be private here

    //here we make Singleton instance static because, that instance does not depend on object of the above class , it is not allowed
    //we are going to create it internally inside the getinstance function to make it create a object only once
    //  so if we make static it does not depend on the object of the above
    private static Singleton instance;

    //make a function to get the instance to be create a object only once and cannot be created further

    public static Singleton getInstance(){
        if(instance == null){
             instance = new Singleton();
        }
        return instance;
    }
}
