package Introduction;

import java.util.Scanner;

public class Reverseofnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        //first get a answer c as 0 because we want to reverse a number if we take 79 and remainder is 9 c is assigned 9 first and next iteratiob 9 multiplied 10 it is 90 and 7 added so 97
        int   c= 0;
        while (a>0){
            // remainder
         int  b = a%10 ;
         // update a value
         a= a/10;
            c = (c * 10 ) + b;

        }
        System.out.println(c);
    }
}
