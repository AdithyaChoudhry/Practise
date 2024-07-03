package OOPS.Defaultobjectclass;

//every class extends its object class
public class Objectclasses {

    int num;

    public Objectclasses() {
        super();//if we click using ctrl we can see the extended default object class
    }

    @Override
    public int hashCode() {
        return super.hashCode();//basically returns the hash code

    }

    public Objectclasses(int num) {
        this.num = num;
    }
    @Override
    public boolean equals(Object obj) {
      //  return super.equals(obj);
        return this.num==((Objectclasses)obj).num;//it aslo checks the value is equal or not
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        Objectclasses obj1 = new Objectclasses(34);
        Objectclasses obj2 = new Objectclasses(34);
        obj1.hashCode();//returns hashcode some random value

        if(obj1 == obj2 ){
            System.out.println("It is equal");//basically checks the  address s equal or not
        }
        if(obj1.equals(obj2)){
            System.out.println("it is equal");//basically checks the value
        }

        System.out.println(obj1 instanceof Objectclasses);//checks the object in instance
        System.out.println(obj1.getClass().getName());//shows the information about the class when we use getclass it stores in heap and
    }
}
