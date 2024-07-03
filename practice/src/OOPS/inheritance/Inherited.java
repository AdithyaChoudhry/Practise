package OOPS.inheritance;

public class Inherited extends Inheritance {

        double weight;

        public Inherited(){
            this.weight=-1;
        }


// here we can generate constructor inherting the parameters of the super class that is parent
    //used to initialise values in the parent classs the constructor below
    public Inherited(double l, double w, double h, double weight) {
            //parent class is super class and child class is sub class
        super(l, w, h);//we are calling it before becausae the child class want to know what is in base class if we put it below it gives error
        this.weight = weight;
    }
    public static void greeting(){
        System.out.println("Hello i am in Inherited class");
    }

    //here it is the copy constructor
    //super we use here refers to the reference type copy constructor in superclass
    //It is same as the Inherited obj = new Inheritance ; -->here it refers to the reference type of the super class only access in super class it is same as that
    public Inherited(Inherited other){
            super();
            this.weight=other.weight;
    }
    public Inherited(double side, double weight){
            super(side);
        this.weight=-1;
    }

}

