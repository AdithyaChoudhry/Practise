package Assignments;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        year(a);
        System.out.println(a);
    }
    static void year(int y){
        if(y % 400 == 0 || y % 100 !=0 && y % 4 ==0){
            System.out.println("It is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
