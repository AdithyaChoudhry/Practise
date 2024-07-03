package Recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {33,44,55,66,77,88,};
        int target = 55;
        System.out.println(binarysearch(arr,target,0,arr.length-1));

    }

    static int binarysearch(int[] arr, int target , int start , int end){


        int mid = start + (end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if (arr[mid] < target) {
            return binarysearch(arr , target , mid+1 , end);

        }
        else {
            return binarysearch(arr , target , start ,mid-1);

        }
    }
}
