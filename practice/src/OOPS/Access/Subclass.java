package OOPS.Access;

public class Subclass extends  Class{
    int value;

    public Subclass(int value,int num, String name){
        super(num, name);
        this.value=value;
        this.getName();//private is accessed here
    }
}

//                 sameclass | samepackage | samepackage.subclass | diffpackage.subclass |diffpackage.notsubclass

//public             +               +               +                   +                   +

//protected          +               +               +                    +

//default(nomodifier)+                +               +

//private            +

