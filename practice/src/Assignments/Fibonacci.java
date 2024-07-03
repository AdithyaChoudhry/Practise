package Assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count =2; //already we have two values find out
       if(n<=1){
           if(n==0){
               System.out.println("0");
           }
           if(n==1){
               System.out.println("1");
           }
       }
       if(n>1){
//           while (count<=n){
//               int temp = b;// making b temp to take the value of its to assign it to a at last , temp instead b because b value changes
//               b = a+ b;
//               a = temp;
//               count++;
//           }

           for (int i = 2; i <= n; i++) {
               int temp =b;
               b = a+b;
               a = temp;
               System.out.println(b);
               count ++;
           }
             }

    }
}
