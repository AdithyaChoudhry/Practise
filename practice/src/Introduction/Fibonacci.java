package Introduction;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0;
        int b=1;
        // giving count 2 because we already have a and b two values so 2
        int count = 2;
//use this to print default values when 0 is given output is 0 and 1 is given output is 1
if(n<=1){
    System.out.println(n);
}
else{
    while (count <= n){
        //first make b value as temp because we are going to make it a at last step that is it replaces the value of a

        int temp = b;
        b = a + b;//now b has new value
        //now a is assigned temp because if we assign b it will take new b value which is incorrect so..
        a = temp;

        count++;

    }
    System.out.println(b);
}

    }

}
