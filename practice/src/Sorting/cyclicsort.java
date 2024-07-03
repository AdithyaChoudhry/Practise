package Sorting;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
       int[] arr= {1,2,3,4,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i =0;//cyclic sort is basically putting the number in correct index
               //example in array 1,2,3,4,5 is available as 2,3,5,1,4  index = value -1 --> 2-1 =1 , 2 must be placed at index 1
        while (i < arr.length){
            int correctindex = arr[i]-1;//taking the index
            if(arr[i]!=arr[correctindex]){//if the arr[index] and arr[i] value is not equal swap it
                swap(arr,i , correctindex);
            }
            else{
                i++;//else increse the element index
            }
        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}

