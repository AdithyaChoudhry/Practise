package BinarySearch;

import java.util.Scanner;

//in this we are going to search in array which the length is infinite
//we dont use here length -1 we find it in a way doubling the chunks of start and end
//that is if end is greater than targer double the chunks ,, if previous length from start to end was 2
//now it will be 4
public class InfinitesortedArray {
    public static void main(String[] args) {
        int[] arr = { -5,4,5,11,12,22,25,36,46,78,89};//creating an array and setting the values in it
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        System.out.println(range(arr,target));

    }

    static int range(int[] arr, int target){
        int start = 0; //first initially setting the start value as 0
        int end =1;//initially end value as 0


        while (target > arr[end]) {
            int temp = end + 1;///new start make temp to assign again in last as we use previous start in middle to find new end
            end = end + (end - start + 1) * 2;
            //previous end ( previous end - start + 1 )
            //example why we are taking (end - start + 1) -- assume we have {2,3,4,5,6,7}
            //first chunk is {2,3 that is start 0 and end 1 , if target is greater than end increase end and start as mentioned above
            //that is {2,3,             4,5,6
              // 4 is start---//7 is end
            //2,3  ,4,5,6


            //2,3 is start -1 elements that is new start - 1th elements that is new start 4
            //to find size of new chunk -- this is (end -(start -1 elements))--> (end - start + 1) -- ( 4 - 2 +1) -- 3 is the size
            //now end = end + ( end - start + 1) * 2 --> e = 1 + ( 3 // above ) -- > 4 which is end
            start = temp;


        }


        return binarysearch(arr,target,start,end);

    }
    static int binarysearch(int[] arr, int target , int start , int end){
//        int start = 0;//giving the value for start
//        int end = arr.length-1;//giving value for end //dont use for infinite sorted array

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
