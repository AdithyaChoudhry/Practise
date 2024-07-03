package Introduction;
import java.util.Scanner;
public class Inputandoutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = input.nextInt();
        System.out.println("The First Number is: " + a);
        System.out.println("Enter the Second Number");
        int b = input.nextInt();
        System.out.println("The Second Number is : " + b);
        int c = a + b;
        System.out.println(c);
    }
}
