package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        System.out.println(fibo(a));

    }

    static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
