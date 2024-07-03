package Recursion;

import java.util.Arrays;

public class selection {
    public static void main(String[] args){
  int [] arr ={1,7,3,2,9,4};
  selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int r , int c , int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr,r,c+1,c);
            }
            else{
                selection(arr,r,c+1,max);
            }//after finding the max go to next row that is below else condtion
        }

        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selection(arr,r-1,0,0);
        }
    }
}
