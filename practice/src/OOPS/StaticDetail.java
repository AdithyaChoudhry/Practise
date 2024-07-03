package OOPS;

//we cannot use static outside the class because it does not depend on other class
//to be static it must depend on other class , it depend on class but not on the objects of that class

//class Test{
//    //When we menton static String here it must be same for both the objects 1 and 2 same ramesh will be the  output due to static String but its different when we used inside the other class
//    //Its dependent
//   static String name;
//
//    public Test(String name){
//        Test.name=name;
//    }
//}
public class StaticDetail {
    //here it can be static because it is depend on other class and hence it can be static , if it is static it does not depend on objects of that class
    //hence it prints both the outputs rahul and ramesh because it doesnot depend on objects of class StaticDetail but Test class and main may depend on each other
    static class Test{
        //but if we make the String statc the output will be same
         String name;
        public Test(String name){
            this.name=name;
        }
        //it basically gives output when we use system.out.print(a) instead a.name due to overriding
        @Override
        public String toString(){
            return name;
        }
    }
    public static void main(String[] args) {
        Test obj1 = new Test("Rahul");
        Test obj2 = new Test("Ramesh");

        // dot here system. or this. ( binds the instance variable to the reference variables )
        System.out.println(obj1.name);
        System.out.println(obj2.name);

        //

    }

}
