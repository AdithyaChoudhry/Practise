package OOPS.Enums;

public class Main {
    //Enums are group of variables that we cannot change it , it is constant
    //for a particular class we haave particular number of Objects

    enum Week implements A {
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;
        //these are enum constant
        // it is final we cannot create child constants
        //it is public and static
        //here it is of type week
        Week(){
            System.out.println("Constructor Called for " + this);//this is the object // though we created only Monday but it prints all the days
        }                                                       //this is because enum constructors are private and not public or protected
                                                                //this is because we dont want to create anyother objects or initialization of new objects
                                                                // it is constant

    //internally it works like public final static Week Monday = new Week();

        //interface
        @Override
        public void hello(){
            System.out.println("Hello");
        }

        //abstract is basically just defining it example void hello() in interface
        // but here we want to use the body like void hello() {}

    }

    public static void main(String[] args) {

        Week week;
        week = Week.Monday;
//        week = Week.Tuesday;//
//
//        for (Week day : Week.values()) {
//            System.out.println(day);
//
//        }
//
//        System.out.println(week.ordinal());//position of enum declaration that is Monday it is at 0 th position

    }
}
