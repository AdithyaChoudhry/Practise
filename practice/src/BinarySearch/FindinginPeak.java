package BinarySearch;

public class FindinginPeak {
    public static void main(String[] args) {



           int[] mountainArr ={1,5,2};
           int target = 5;
            int peak = peakinarray(mountainArr);//first we get the peak element of the array
            //using peak element if lesser than peak we search in Ascending
            //greater than peak descending order
            int ans = binarysearch(mountainArr,target,0,peak, true);//passing the values
            // start is 0 if ascending is true because index starts at 0 and end is peak element
            if(ans!=-1){
                System.out.println(ans);//no ans found return -1
            }
            else { binarysearch(mountainArr,target,peak+1,mountainArr.length-1 , false);}
            //start is peak + 1 because descending order so we take peak+1th element as start and
            //end as length()-1 -- it is interface here they defined as length() so we want to use()

        }

        static int peakinarray( int[] mountainArr){//finding the peak
            int start =0;
            int end = mountainArr.length-1;

            while(start<end){
                int mid = start + (end - start)/2;

                if(mountainArr[mid]>mountainArr[mid+1]){
                    end = mid;//use get(int index) because defined in interface
                    //mid > mid +1 mean , that is greatest element
                    //towards left side mid is greater as mid+1 is lesser
                    //so the end is mid not mid-1
                }
                else{
                    start = mid+1;//mid+1 greater mean it is greater than mid element
                    //towards right side mid+1 is greater than mid
                    //so mid+1 and may be greater element present further
                    //so mid+1 element is now bigger
                }
            }
            return start;}//when start and end is finally equal it is the peak element
        //returning the start and storing in peak to assign start particularly for ascending and descending

        static int binarysearch(int[] mountainArr,int target ,int start , int end,boolean isAsc){

            isAsc = mountainArr[start]<mountainArr[end];
            while(start<=end){
                int mid = start + (end - start)/2;


                if(isAsc){
                    if(mountainArr[mid]>target){ //Ascending
                        end=mid-1;//mid is greater than target so we want to search left side
                        //start is same but end is mid-1
                    }
                    else if(mountainArr[mid]<target){
                        start= mid+1;//mid is lesser than the target so we want to search right side
                        //end is same start is mid+1
                    }
                    else {
                        return mid;
                    }


                }
                else{
                    if(mountainArr[mid]<target){
                        end=mid-1;//in descending target is greater than mid that mean
                        //end is mid -1
                        //ex: 5 4 3 2 1 --mid 3 target 5 -- 5 is greater so end become mid -1
                    }
                    else if(mountainArr[mid]>target) {
                        start= mid+1;
                        //in descending target is lesser than mid
                        //start is mid+1
                        //ex: 5 4 3 2 1 -- target 2 mid 3 -- 2 is less than 3
                        //so mid+1
                    }
                    else{
                        return mid;
                    }

                }
            }
            return -1;}
    }

