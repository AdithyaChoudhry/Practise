package BinarySearch;

import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {

        int[] arr = { -5,4,5,11,12,22,25,36,46,78,89};//creating an array and setting the values in it
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int ans = binarysearch(arr,target);//creating a function to pass the array and the target value ans assigning it to answer
                                          // to print the index of the located value
        System.out.println(ans);

    }
    static int binarysearch(int[] arr, int target){
        int start = 0;//giving the value for start
        int end = arr.length-1;//giving value for end

        while (start <= end){//when start lesser than end go inside the array
            int mid = start + (end - start)/2;//make mid value instead of (start - end ) make (s+(e-s)/2) because sometimes start i end exceeds the value of integer

            if(arr[mid] < target){// arr value greater than target go to right side of array as it is sorted array
                start = mid +1;// end is same , start is greater than mid so mid+1
            }
            else if(arr[mid] > target){// arr value lesser than target go to left side of array as it is sorted array

                end = mid - 1;//start is same but end is lesser than mid so mid-1
            }
            else {
                return mid;//if mid is equal to target return the index of the value
            }
        }
        return -1;}//nothing else found return -1 that is start is greater than end means no value is present

}
//it O(logN) because first iteration it will be N/2
// 2nd N/2/2 ==N/4 and
// 3rd N/8 increase in way 2^k
//finally it is 1 that is final element is found when N/2^k iss achieved
//N/2^k =1 --> N=2^k --> log(N)=log2^k   -->log(N) = k log 2 -->k = log N/log 2 --> log base2N
//for linear search it is N comparisons
   //for 1million th value 1 million compariosn

//in same binary search
 //log(1million)== 20 comparisons