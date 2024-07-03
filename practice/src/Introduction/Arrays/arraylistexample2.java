package Introduction.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistexample2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(10);

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }



}
