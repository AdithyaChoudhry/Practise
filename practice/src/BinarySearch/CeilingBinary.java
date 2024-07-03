package BinarySearch;

import java.util.Scanner;
//floor of a number is finding the element that is finding the smallest number that is greater than the target number
//that is if number 15 is the target and number 15 found return the numer else
//return the number next to 15 that is smallest number greater than 15 that is if 16,17,18 in array return 16
//how we return that we simpky return start element instead of -1 because
//when start is greater than end while loop violated and condition is false and does not go inside the while loop
//that is it means start is greater than the end that means it is greater than the target now return the start which is smallest number greater than the target
public class CeilingBinary {
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

        if(target > arr[arr.length-1]){
            return -1;
        }

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
        return start;}//nothing else found return -1 that is start is greater than end means no value is present
}
