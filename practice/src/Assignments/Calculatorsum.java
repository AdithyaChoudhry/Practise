package Assignments;

import java.util.Scanner;

public class Calculatorsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operation");
        char op = input.next().trim().charAt(0);
        int a=0;
        int b=0;

        while (true){
            int ans = 0;
          if(op=='+' || op== '-' || op=='*' | op =='/'){
         System.out.println("Enter the value 1");
           a = input.nextInt();
          System.out.println("Enter the value 2");
           b = input.nextInt();
}
            if(op == '+'){
                ans= a+b;
                
            }
            if(op == '-'){
                ans= a-b;
            }
            if(op == '*'){
                ans= a*b;
            }
            if(op == '/' && b !=0){
                ans= a/b;
            }
           else{
                if(op == 'x' || op=='X'){
                    break;
                }
            }
            System.out.println(ans);
        }
        
    }


    }

