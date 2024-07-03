package Introduction.Arrays;

import java.util.Arrays;

public class SwapinArray {
    public static void main(String[] args) {
        int[] arr = {7,9,34,21,33};
        System.out.println(Arrays.toString(arr));
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
     static void swap(int[] arr , int index1 , int index2){
        int temp=arr[index1];
         arr[index1] = arr[index2];
         arr[index2]=temp;
    }
}
