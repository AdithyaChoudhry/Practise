package Sorting;

import java.util.Arrays;

public class Selectionandinsertion {
    public static void main(String[] args) {
        int[] arr={5,4,21,3,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){//selection sort
        int last;//declaring the last
        for (int i = 0; i < arr.length; i++) {
             last = arr.length-i-1;//settign it as arr.length-i-1 because everytime when greater element is moved to
                                  // last index of the array next time we no need to check for it so only it is assigned as this
            int maxindex = getmax(arr,0,last);//getting the max value
            swap(arr,maxindex,last);//swapping as normal
        }


    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {//or i<=arr.length-2 //i taken upto < arr.length -1
                                           //j is taken as -- because it always checks with previous values , that is decresaing one by one
            for (int j = i+1; j > 0; j--) {//insertion sort is using a index and sorting
                                       //taking upto particular index and sorting it firs 0 to 1 , 0 to 2 so on
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first , int last){
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }

    static int  getmax(int[] arr ,int  first , int last){
        int maxvalue = first;
        for (int i = 1; i < last ; i++) {
            if(arr[maxvalue] < arr[i]){
                maxvalue=i;
            }
        }
   return maxvalue; }


}
