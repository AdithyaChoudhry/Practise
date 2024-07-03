package BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,6,6,1,2,3};
        System.out.println(findpivotduplicates(nums));

    }
    static int search(int[] nums , int target){ //defining the function
        //pivot is larget number in the array basically
        // in rotated sorted array element which makes the change to descending that is pivot
        // 5,6,7,2--> 7 makes it descending so 7 is pivot
        int pivot = findpivot(nums);//passsing the function to findpivot that is copy of the value nums[] to arr[]

        if(pivot==-1){//if the pivot is not found do normal binary search
            return  binarysearch(nums, target ,0 ,nums.length -1);//passing the values to binary search
        }
        //pivot found
        if(nums[pivot]== target){//pivot is equal to target then return the pivot
            return pivot;
        }
        if(target>=nums[0]){//pivot found and target element is greater than the start element
            //end is pivot -1 because pivot is greater element if answer is pivot it would have been
            //found in the before condition itself so it must be less than pivot so end is pivot -1
            //also all members after pivot is smaller than start
            //use target < or equal because if ,we not use equal it will not pass it just end the
            //condition and return -1 for target = num 0
            return  binarysearch(nums, target ,0 ,pivot -1);
        }

        return binarysearch(nums, target ,pivot+1 ,nums.length-1);//else start is pivot+1 because
        //target lesser than start that is it mean all less
        //elements are after pivot+1 soo we can easily find

    }


   static int binarysearch(int[] arr, int target , int start , int end){//normal binary search code


        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                return mid;
            }

        }
        return -1; }

    static int findpivot(int[] arr){
        int start = 0;
        int end =  arr.length - 1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){//using condition mid < end because if last element is mid and mid+1
                //mid+1 is checked as no mid+1 index out of bound
                //so we check mid is less than end

                //mid element > mid +1 mean no element is greater than mid, so it is
                //pivot
                return mid;
            }
            if(mid > start && arr[mid-1]>arr[mid]){
                return mid-1;//similarly if start is mid , mid -1 is used index out of bound

            }
            if(arr[start]>=arr[mid]){
                end = mid -1;//if start is greater than mid means element after the start and in between must
                //greater so ignore elements after mid for that end is mid-1
            }
            else{
                start = mid+1;//else start < mid mean all element before mid is lesser so
                //ignore that by keeping start as mid+1
            }
        }
        return -1;
    }
    static int findpivotduplicates(int[] arr){
        int start = 0;
        int end =  arr.length - 1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){//using condition mid < end because if last element is mid and mid+1
                //mid+1 is checked as no mid+1 index out of bound
                //so we check mid is less than end

                //mid element > mid +1 mean no element is greater than mid, so it is
                //pivot
                return mid;
            }
            if(mid > start && arr[mid-1]>arr[mid]){
                return mid-1;//similarly if start is mid , mid -1 is used index out of bound

            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //check whether start mid and end are equal after that check whether start and end are pivots are not
                if(start < end && arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if( end > start && arr[end - 1]> arr[end]){
                    return end-1;
                }
                end--;

            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end] ) {
                start=mid +1;
            } else {
                end=mid -1;
            }
        }
        return -1;
    }
}
