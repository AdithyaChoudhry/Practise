package Assignments;

import java.util.Scanner;

public class ques3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

    }

    public static String format(int a , int b){
        int result = 1;
        for (int i = a; i < b; i++) {
            result = result * i;


        }
        int power = 0;
        while((result % 10)==0){
            power=power+1;
            result=result/10;
        }
   return result + "10^"+power;
    }




}
