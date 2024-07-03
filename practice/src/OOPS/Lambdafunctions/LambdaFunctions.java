package OOPS.Lambdafunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
     //Lets create an Arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            arr.add(i + 1);
        }



        arr.forEach(
                //item contains the parameter
                (item)->{
                    //body of the function
            System.out.println(item * 2);//here item basically represents the values in the for loop on the line 9
        });

        //consumers take single input and do not return result
        //this is the consumer type
        Consumer<Integer> fun = (item) -> {
            System.out.println(item * 2);
        };
        //now i can just use the function name instead of the entire thing like in 16 th line

        arr.forEach(fun);

        //if we want to use multiple parameters we can create interface
        //create inter face in line 53
        Operator sum = (a,b)->(a+b);
        Operator prod = (a,b)->(a*b);
        Operator Sub = (a,b)->(a-b);
       //operator op
        LambdaFunctions calculator = new LambdaFunctions();

        calculator.operate(5,6,sum);
    }

   //create and declare what you want

    //operator see 34 line Operator refers operator--sum,prod,sub refers op in line 34 , it is used in the function paremeters in line 46
    private int operate(int a , int b , Operator op){//operators refers to interface
        return op.operation(a,b);//operation refers to values inside interface,
     }                           //using op.operation we access value inside it

    // flow  line 40 - operator goes to operator linee 46 - which have interface operator op(type) that op.operation refers 54 line
}      //.operation in interface refers  the body in 34 lne that is (a,b)->(a+b)

interface Operator{
    int operation(int a , int b);// interface decides which one to execute at run time
}