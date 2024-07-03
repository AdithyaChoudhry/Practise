package Introduction;

import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        greeting();
        Add(5,7);
        swap(5,3);
        String name = "Pranesh ";
        change(name);
        System.out.println(name);
      int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        changearray(arr);
        System.out.println(Arrays.toString(arr));
    }
    //without passing the Arguments
    static void greeting(){
        System.out.println("Hello World");
    }
    //passing the Arguments
    static int Add(int a , int b){
        int c =  a+ b;
        return c;
    }
    static void swap(int a , int b)
    {
        int temp = a ;
         a = b;
         b = temp;
        System.out.println(a+ " " +b);

    }
    //Here it does not change the value because we are creating a new object not modifying it , if we modify the values we will be able to change it
    //Though Strings are immutable(cannot change due to some security reasons )  we cannot Change it
    static void change(String naam){
        naam = "Rakesh";

    }
    //In java there is no pass by reference as there is no pointers that is we are not passing value based on address
    //In java there is only pass by value , we are passing the value of copy of that reference variable
    //values variable here is the reference value of arr which itself get the values of objects {1,2,3,4,5}
    static void changearray(int[] values){
        values[0]=3;
        //here if we make a change to this object via this reference variable same object will be Changed
    }
}
