package BinarySearch;

public class Findingpeak2 {
    public static void main(String[] args) {
        int[] mountainArr ={3,5,3,2,0};
        int target = 3;
        int l=0;
        int r = mountainArr.length-1;


        while(l<=r){
            int mid = l +(r-l)/2;
            if(mountainArr[mid]>mountainArr[mid+1] )
            {r=mid-1;}
            else l=mid+1;
        }
        int maxIndex = l;

        //Finding the target element in the  left side of array

        l = 0;
        r = maxIndex -1;

        while(l<=r){
            int mid = l +(r-l)/2;
            if(mountainArr[mid]==target) {
                System.out.println(mid);
                break;
            }
            else if(mountainArr[mid] < target) l = mid+1;
            else r = mid-1;
        }
        l = maxIndex;
        r = mountainArr.length - 1;

        while( l <= r ){
            int mid = l + ( ( r - l ) / 2 );
            if( mountainArr[mid] == target) {
                System.out.println(mid);
                break;
            }
            if( mountainArr[mid] > target ) l = mid + 1;
            else r = mid - 1;
        }



    }
    }



