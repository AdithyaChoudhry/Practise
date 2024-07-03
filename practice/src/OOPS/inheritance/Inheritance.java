package OOPS.inheritance;

public class Inheritance {
    double l;
    double w;
    double h;

    public Inheritance(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    //static method
    public static void greeting(){
        System.out.println("Hello i am in Inheritance class");
    }

    //copy constructor
    public Inheritance(Inheritance old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }

    public Inheritance(double side){
        this.h=side;
        this.w=side;
        this.l=side;
    }

    public Inheritance(double l , double w, double h){
        this.w=w;
        this.l=l;
        this.h=h;
    }
}
