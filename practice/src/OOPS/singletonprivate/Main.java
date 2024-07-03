package OOPS.singletonprivate;


//Singleton class meand we want to create the object only once and cannot use it further that is
//we want make keep calling the cosntructor again and again hence we make it private
public class Main {
    public static void main(String[] args) {
        //as once it creates the object in singleton.java it cant create further object
        //we cant call the constructor here

  Singleton obj1 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        //all three refernce variable are just pointing to the one object because when 2nd reference variable asks to create a object
        //it says i am already created a object u can refer to that and it get refered to that similarly for all the objects
        //that is why here only object is created

    }
}
