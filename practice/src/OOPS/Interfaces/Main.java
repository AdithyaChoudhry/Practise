package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine obj = new Car();//new dynamically allocates memory while creating a object that is instantiating and returns a refernce to it
        //car.a // not accessible it because  refercence type to Engine
        obj.start();//these are which version to run it depends on the object that is car
        obj.accelerate();

        obj.stop();

        Allinonecar obj2 = new Allinonecar();
        obj2.start();
        obj2.startMusic();
        obj2.stop();
        obj2.stopMusic();
        obj2.upgradeengine();
        obj2.start();
    }
}
