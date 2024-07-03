package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static  void main (String[] args) {
        int[] arr = {2, 5, 3, 4};
        int[] result = new int[5];
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int sum = 0;
        int i, j;
        for (i = 0; i < arr.length - 1; i++) {

            sum = arr[i] + arr[i + 1];
            System.out.println(sum);
            if (sum == target) {
                System.out.println(i);
                System.out.println(i+1);
                result[i] = i ;
                result[i] =i+1;
                System.out.println(Arrays.toString(result));
                break;


            }


            }
        }
    }



