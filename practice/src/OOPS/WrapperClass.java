package OOPS;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive it is not passed as pass by value only the oject 10 is passed which is not equal to int a in swap function


//        int a = 10 ;
//        int b = 90 ;

        //if we use Integer it will create a object more or less like this Integer a = new Integer();
        Integer a ;
        Integer b ;
        //Wrapper class is basically when we use integer instead of int it shows many properties like Integer.compare , Integer.bitcount etc..

        swap(40,50);
    }
    static void swap(Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a+ " "+ b);
    }
}
