package Introduction.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);// it is two pointer because we use two elements and comparing it with one another
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start =0 ; //starting index is 0
        int end = arr.length - 1;//endiing index is 4- here length is 5 so 5-1 == 4

        while(start < end){
            swap(arr,start,end);
            start++;//comparing first and last and swapping it - increasing start element by 1 and decreasing emd element by 1 and swapping it
                    // similarly done and when start is greater than end stop swapping it....
            end--;
        }
    }
    static void swap(int[] arr , int index1 , int index2){
        int temp=arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=temp;
    }
}
