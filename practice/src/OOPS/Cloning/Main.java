package OOPS.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)  throws  CloneNotSupportedException{//wherever we use this mention its Exception if it throw exception
        Human obj = new Human(23,"Ramesh");
    //    Human obj2 = new Human(obj); //basically we clone like this use this method

        Human obj3 = (Human)obj.clone();
        System.out.println("Shallow copy");
        System.out.println(obj3.age+ " "+ obj3.name);

        //System.out.println(Arrays.toString(obj3.arr));

        //obj3.arr[2]=100;

       // System.out.println(Arrays.toString(obj3.arr));
      //  System.out.println(Arrays.toString(obj.arr));
        //shallow copy
        //it changes the value in original one because it is just pointing to original one as it isnon primitive
        //both arraya and string are non primitive its pointing to original one

        //if we print after deepcopying in the line 31 in Human.java file
        System.out.println("----------------------------");
        System.out.println("Deep Copy");
        System.out.println(Arrays.toString(obj3.arr));
        obj3.arr[2]=100;
        System.out.println(Arrays.toString(obj3.arr));
        System.out.println(Arrays.toString(obj.arr));
    }
}
