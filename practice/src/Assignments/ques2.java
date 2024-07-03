package Assignments;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();//subarray length
        int n = input.nextInt();//total length

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=input.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n-x; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < i+x; j++) {
                min = Math.min(min,arr1[i]);
                max= Math.max(min,max);
            }
            System.out.println(max);
        }


    }



}
