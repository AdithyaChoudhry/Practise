package Introduction;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0 ;
       while ( true ){
           System.out.println("Enter the operator :  ");
           char op = input.next().charAt(0);
           if(op== '+'|| op== '-'|| op== '/'|| op=='%'|| op=='*') {
               System.out.println("Enter the first number: ");
               int a = input.nextInt();
               System.out.println("Enter the second number: ");
               int b = input.nextInt();

               if (op == '+') {
                   ans = a + b;
               }
               if (op == '-') {
                   ans = a - b;

               }
               if (op == '*') {
                   ans = a * b;

               }
               if (op == '/') {
                   if (b != 0) {
                       ans = a / b;
                   } else {
                       System.out.println("Divisor is invalid ");
                   }
               }

               if (op == '%') {
                   ans = a % b;

               }
           }
           else if (op == 'x' || op == 'X') {
               break;

           } else {
               System.out.println("Invlaid");
           }
           System.out.println(ans);
               }

           }

       }


