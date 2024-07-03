package Introduction;

import java.util.Scanner;

public class Numberoccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Sequence of Number");
       long  a = input.nextInt();
        System.out.println("Enter the Required number to count its occurence in the sequencces ");
        int b = input.nextInt();
       int  count=0;
       //checks for number greater than 0
       while (a>0)
       {
           // get a new variable and take its result to c and check c is equal to b that is the remainder is equal to the required number if yes increase count
           // we got error when we assigned b = a % 10  because we want to match the result value and check whether its equal or not to do it we require another variale thats y we assigned c
          long c =a % 10;
          if(c==b){
              count++;
          }
          //else get the quotient and repeat the process
           //to count the number of digits just use this and increase the count value
          a = a /10;

       }
        System.out.println(count);
    }
}
