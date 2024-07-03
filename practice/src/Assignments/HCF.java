package Assignments;

//public class HCF {
//    public static void main(String[] args) {
//        int hcf =0;
//        Scanner input = new Scanner(System.in);
//        int a =input.nextInt();
//        int b =input.nextInt();
//        for (int i = 1; i < (a+b)/2 ; i++) {
//            if( (a % i)==0 && (b % i) ==0){
//               hcf = i;
//            }
//        }
//        System.out.println(hcf);}
//}

import java.util.Scanner;

public class HCF {
    public static void main(String[] args){
        int hcf = 0;

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b= input.nextInt();

        for(int i=1 ; i < a+b/2 ; i++){
            if((a%i)==0   && (b%i)==0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}