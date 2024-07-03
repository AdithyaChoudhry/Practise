package OOPS.inheritance;

public class MultilevelInherit  extends  Inherited{
    double speed;

 MultilevelInherit() {
        super();
        this.speed=-1;
    }
    //it calls its super class and the above one calls the superclass of it this is multilevel inheritance
    MultilevelInherit(double side ,double weight, double speed){
     super(side,weight);
     this.speed=speed;
    }
}
