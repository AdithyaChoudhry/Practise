package OOPS.Cloning;

public class Human implements Cloneable{//eventhough it does not have any abstract methods inside it we are telling the jvm(java virtual machine) to just clone it

    int age;
    String name;
    int[]  arr;

    public Human() {
    }

    public Human(int age, String name ) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }

//    public Human(Human other){
//        this.age= other.age; //we are basically using this for cloning it requires more time and process so we use another method called cloning by interface
//        this.name = other.name;
//    }

    //@Override //we can also override this- because it is overriding - it is overriding the object
    public Object clone() throws CloneNotSupportedException{// because inside clone throw excpetion so we want to declare that it throws some exception also
        //this is shallow copy                                //wherever we use this we want to mention it
       // return super.clone(); or below
        Human obj3 = (Human)super.clone();


        //this is deep copy - that is copying the entire thing rather than pointing to it
        obj3.arr = new int[obj3.arr.length];
        for (int i = 0; i < obj3.arr.length; i++) {
            obj3.arr[i] = this.arr[i];
        }
        return obj3;
    }
    // this is shallow copy - if it is primitive it copies and produces again
    // if it is non primitive it just points the original one that is why if
    // we change the value of array at any index it changes in the original one also




}
