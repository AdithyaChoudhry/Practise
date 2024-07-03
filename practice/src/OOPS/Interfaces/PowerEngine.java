package OOPS.Interfaces;
//interface to interface we can inherit using extend
//class to interefaces we use implements
public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stoppped");
    }

    @Override
    public void accelerate() {

        System.out.println("Power Engine Accelerated");
    }
}
