package Introduction.Arrays;

import java.util.Scanner;

public class NonPrimitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] obj1 = new String[5]; //each element in the heap as separate object and stored in non continuous manner

        for (int i = 0; i < obj1.length; i++) {
            obj1[i] = input.next();

            System.out.println(obj1[i]);
        }


    }

}

