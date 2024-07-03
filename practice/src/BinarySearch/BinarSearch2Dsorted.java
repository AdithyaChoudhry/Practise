package BinarySearch;

import java.util.Arrays;

public class BinarSearch2Dsorted {
    public static void main(String[] args) {
          int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(matrix2d(arr,8)));
    }

    static int[] binarysearch(int[][] matrix, int row , int cstart , int cend , int target){

  while (cstart<=cend){//simple binary search code is implemented here just changing the variables and the values
      int mid=cstart+(cend-cstart)/2;
      if(matrix[row][mid]==target){//mid mentioned here is the ( mid in a row)
          return new int[]{row,mid};
      }
      if(matrix[row][mid]>target){
          cstart=mid+1;//if greater than the target cstart is mid + 1

          // cstart -> {0,1,2,3} here 2 is target and 1 is mid  ,
          // target greater than the element so next start will be mid+1
      }
      else{
          cend=mid-1;// here it will be mid-1
      }
  }


    return  new int[]{-1,1};}//returning -1 -1 if nothing found

    static int[] matrix2d(int[][] matrix, int target){
        int row = matrix.length;//setting the values of rows
        int col = matrix[0].length;//setting cols in the rows that is 0 th row length that is columns
        if(col==0){// if it has no clomuns we cannot search in it so return -1 -1
            return new int[]{-1,-1};
        }

        if(row==1){//if it has only one rows just do simple binary search
        return binarysearch(matrix,0,0,col-1,target);
        }

        //runnning the loop till two rows are remainig
        //eliminating the unwanted rows
        //{1,2,3}{4,5,6}{7,8,9}{10,11,12} if we want to search for 5 all the elements below
        // it are unwanted so we want to eliminate it
        //eliminating by founding the mid
        //if greater than the mid above rows are eliminated
        //if lesser than the mid below row are eliminated
        int rstart =0;
        int rend = row -1;
        int cmid = col/2;//this is constant as we set up in the first itself ,
        // as this c mid is constant we perform binary search here so simple col/2 is enough
        //like {1,2,3}
        //     {4,5,6} here cmid is 3/2 that is 1 so c mid is 1 , keeping the cmid and adding -1 to it or +1 to it peroform a binary searcj

        while (rstart < (rend-1)){
            int mid = rstart + (rend-rstart)/2;
          //if target is equal then return
            if(matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            //if target is greater than
//            1{1,2,4}
//            2{4,5,6} mid and rstart -- initially rstart is in 1
//            3{7,8,9}
//
            //just set the mid to rstart

            if(matrix[mid][cmid]<target){
                rstart=mid;
            }
            //else rend is mid
            else {
                rend=mid;
            }}

        //after it rows is reduced
        //after rows reduced search in the cmid itself
      //  1{1,-2--,3,4} rstart
//        2{5,-6--,7,8} rstart+1
        //that is 2 in first row and 6 in first row


            if(matrix[rstart][cmid]==target){
                return new int[]{rstart,cmid};
            }
            if(matrix[rstart+1][cmid]==target){
                return new int[]{rstart+1,cmid};   //if found return it
            }

            //search in first half
        //that is in 1 in first row binary search
            if(matrix[rstart][cmid-1]<=target){
                return binarysearch(matrix,rstart,0,cmid-1,target);
            }
            //search in 2 nd half that is  3,4 in first row binary search
            if(matrix[rstart][cmid+1]>=target && target<= matrix[rstart][col-1]){
                return binarysearch(matrix,rstart+1,cmid+1,col-1,target);
            }
            //2nd row that is element 5
            if(matrix[rstart+1][cmid-1]==target){
                return binarysearch(matrix,rstart+1,0,cmid-1,target);
            }
            //2nd row elements 7 and 8
            else {
                    return binarysearch(matrix,rstart+1,cmid+1,col-1,target);
            }
        }

    }

