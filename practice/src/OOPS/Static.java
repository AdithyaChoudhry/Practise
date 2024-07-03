package OOPS;

public class Static {
    public static void main(String[] args) {
        Human Rahul = new Human(23,"RahulR");
        Human Rakesh = new Human(33,"Rakesh");
// if 1 human objext was created that is rahul it will increase from 0 to 1 that is Human.population created mean it will increase by 1 , if 2 human .population created it will increase by 2
        // similarly it will the variable to common to all the object that is why it is static
        System.out.println(Human.population);
        //we can use static variables even we did not create objects that is why it is static


    }
}
class Human{


    int age;
    String name;
    static  int population ;

    static void fun3(){
        //see we cannot use this keyword inside the static because this is reference to object though static does not have a objecct
       // System.out.println(this.age);
    }
    public Human(int age,String name) {
        this.age = age;
        this.name = name;
        Human.population += 1;
    }


    //here we cannot use the non static function inside the statc function because
    //non static depends on object to use it
    //static does not depend on objects so we can use it that is it public static void of public class we can use it without creating the objects so why it is object independent
//    static void fun(){
//        greeting();//error occurs because we are accessing non static inside a static
//    }

    //but we can use like this see , when  we create object For non staic and then we access the non static function inside and then use it
    static void hello(){
        Human obj = new Human(23,"Ramesh");
        obj.greeting();
    }

    //but we can use static function inside the non static function because it is static object independent
    void greeting(){
        System.out.println("Hello World");
    }


}
