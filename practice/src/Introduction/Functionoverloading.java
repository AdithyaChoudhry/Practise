package Introduction;

public class Functionoverloading {
    public static void main(String[] args) {
        fun(5);
        fun("Rahul");
    }

    //Overloading of function is  when we use dame name for two functions ,
    //we can use same name for two function but the arguments length or arguments type should be different
static void fun(int a){

    System.out.println(a);

}
static  void fun(String name){

    System.out.println(name);

}
}
