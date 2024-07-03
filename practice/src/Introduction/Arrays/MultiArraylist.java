package Introduction.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        //initialise it or else we could not add the elements
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList());

        }
        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);
    }
}
