package OOPS.Interfaces;

public interface Engine {
    //interfaces are diffferent from classes
    //classes have variables and instancees
    //interfaces have final and static methods and do not create objects
    //we cannot extend 3 things in classes so we create an interface and create custom classes in it

    //it is simply overrding that is which method to run is decided at the run time

    void start();
    void stop();
    void accelerate();
}
