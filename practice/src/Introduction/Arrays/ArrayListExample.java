package Introduction.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>(10);
        Scanner input = new Scanner(System.in);
//        list.add(5);
//        list.add(6);
//        list.remove(1);//it removes at the index we mention
       // System.out.println(list);

        //to get inputs
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        //to get outputs
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//we cannot print using  list[i] instead use get index
        }


    }
}
