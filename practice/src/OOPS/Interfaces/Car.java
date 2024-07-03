package OOPS.Interfaces;

public class Car implements brake , Engine{

    int a=70;//we cannot access this in main class because it reference to engine Interface so it can access only in engineInterface
    @Override
  public  void start(){
        System.out.println("I start the Car");
    }
    @Override
    public void stop(){
        System.out.println("I stop the car");
    }
    @Override
   public void Brakes(){
        System.out.println("I applied brakes");
    }
    @Override
    public void accelerate(){
        System.out.println("I accelerate");
    }

}
