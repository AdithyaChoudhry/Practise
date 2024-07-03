package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(count(arr));
    }

    static int count(int[] arr){
        int pivot = findpivot(arr);
        return pivot+1;//as pivot is at index 3 so index+1 that is pivot + 1
                      //array is rotated 4 times 7,1,2,3,4,5,6   1st rotation
        // 6,7,1,2,3,4,5  \ 2nd rotation
        // 5,6,7,1,2,3,4 \ 3rd rotation
        // 4,5,6,7,1,2,3 \ 4th rotation
    }

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid+1] < arr[mid] ){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=mid){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
    return -1;}

    static int findduplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid+1] < arr[mid] ){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                //skip duplicates but before we want to check
                //start is pivot or not
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end-1]>arr[end]){
                    return end-1;
                }
                end--;
            } else if (arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
    return -1;}
}
