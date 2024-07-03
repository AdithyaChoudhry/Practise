package OOPS;

public class InitializationOfStatic {
    static int a = 5;
    static int b;
    String name ;
    //static block created and run only once when the class is loaded and did not run second time it is initialized only on when the class is loaded for the first time
    static {
        System.out.println("I am initialized only once ");
        b = a * 7;
    }

    public static void main(String[] args) {
        InitializationOfStatic Obj1 = new InitializationOfStatic();
        Obj1.a=5;
        System.out.println(InitializationOfStatic.a + "    "+ InitializationOfStatic.b);

        InitializationOfStatic.b+=5;
        System.out.println(InitializationOfStatic.a + "    "+ InitializationOfStatic.b);

        InitializationOfStatic obj2 = new InitializationOfStatic();//here you can see when it is loaded again it does not use the a multipled by 7 applied to b again , also print statement run only
        //once so it is static
        System.out.println(InitializationOfStatic.a + "    "+ InitializationOfStatic.b);

    }
}
