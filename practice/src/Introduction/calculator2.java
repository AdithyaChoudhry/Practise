package Introduction;

import  java.util.Scanner;
public class calculator2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            char op = input.next().trim().charAt(0);
            if(op=='+' || op=='-' || op== '/' || op =='*' || op=='%'){
                System.out.println("Enter the first number");
                int first = input.nextInt();
                System.out.println("Enter the Second Number");
                int second = input.nextInt();
                int c;
                if(op=='+'){
                    c=first+second;
                    System.out.println(c);

                }
                if(op=='-'){
                    c=first-second;
                    System.out.println(c);

                }
                if(op=='/'){
                    if(second!=0 ){
                        c=first/second;
                        System.out.println(c);
                    }
                    else{
                        System.out.println("Invalid Divisor");
                    }
                }
                if(op=='*'){
                    c=first * second;
                    System.out.println(c);

                }
                if(op=='%'){
                    c=first % second;
                    System.out.println(c);
                }
            }
            else if (op=='x' || op=='X') {
                break;
            }
            else{
                System.out.println("Invalid option Entered");
            }
        }
    }
}
