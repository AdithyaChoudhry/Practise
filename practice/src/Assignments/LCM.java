package Assignments;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max=0;
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
       while (true){
           if((max%a)==0 && (max%b)==0 ){
               System.out.println("lcm is "+max);
               break;
           }
       max++;}
    }
}
