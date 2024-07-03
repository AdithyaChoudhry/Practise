package Introduction;

import java.util.Scanner;

public class swapwotemp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();

        System.out.println("Enter the numbers to swap");
        swap(input1,input2);
    }
    static void swap(int a, int b){
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("after swapping");
        System.out.print(a+" ");
        System.out.print(b);

    }
}
