package Introduction.Arrays;

import java.util.Arrays;

public class Maxelement {
    public static void main(String[] args) {
       int[] arr = {1,34,56,7,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxelement(arr));
        System.out.println(maxelementrange(arr,1,2));
    }



    //without specifying the range
    private  static int maxelement(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
    //with specifying the range
    static int maxelementrange(int[] arr, int start , int end){
        //edge cases
        if(end<start || end >= arr.length || start<0){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int max = arr[start];
        for (int i = 1; i < end; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
}
