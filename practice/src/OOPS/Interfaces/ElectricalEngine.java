package OOPS.Interfaces;

public class ElectricalEngine implements Engine{


    @Override
    public void start() {
        System.out.println("Electric Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Electrical Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Electrical Engine Accelerated");
    }
}
