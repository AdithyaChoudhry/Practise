package Introduction;

public class Scope {
    static  int x = 100;
    public static void main(String[] args) {
        int a = 10;
        int b = 90;

        //shadowing is lower level overrides the value of higher level scope

        System.out.println("value of x is :" + x);
        x= 50;
        System.out.println("value of x after shadowing" + x);

        shadow();



        //Anything that is initialised outside the block can be used inside the block
        //But anything that is initialised inside the block cannot be use outside
        System.out.println(a);
        //prints the value of a initialised
        System.out.println(b);
        {
            //here the original variable value is changed so its prints the new value
            a= 50;
            System.out.println(a);
            b=30;
            System.out.println(b);
        }
        System.out.println(a);
        System.out.println(b);
    }
    static void shadow(){
        System.out.println(x);
    }
}
