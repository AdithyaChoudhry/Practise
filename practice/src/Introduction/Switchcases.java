package Introduction;

import java.util.Scanner;

public class Switchcases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empid = input.nextInt();
        String Department = input.next();
        switch (empid) {
            case 1:
                System.out.println("Ragu");
                break;
            case 2:
                System.out.println("Somu");
                break;
            case 3:

                switch (Department){
                    case "IT":
                        System.out.println("Ramesh");
                        break;
                    case "ECE":
                        System.out.println("Rajesh");
                        break;
                    case "EEE":
                        System.out.println("Pranesh");
                        break;
                    default:
                        System.out.println("Enter the correct details");
                }
                //use break because it is nested switch case
                break;
            default:
                System.out.println("Enter the valid details");
        }
    }
}
