package Introduction.Arrays;

import java.util.Arrays;

public class maxelelement {
    public static void main(String[] args){
        int[] arr = {32,45,21,33,65,4443,122,122211};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxelement(arr));
        System.out.println(maxelementrange(arr,0,3));

    }
    static int maxelement(int[] arr){
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }

    static int maxelementrange(int[] arr, int start , int end){
        if(end<start || end >= arr.length || start<0){
            return -1;
        }

       if(arr==null){
           return -1;
       }


        int max =arr[start];
       for(int i=0;i<end;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }

       return max;
    }
}
