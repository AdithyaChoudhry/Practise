package BinarySearch;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(array(matrix,50)));

    }
    static int[] array(int[][] matrix , int target){
            int row = 0;
            int col = matrix.length-1;

            while(row < matrix.length && col >=0){
                if(matrix[row][col]==target){//if target found return it
                    return new int[]{row,col};
                }
                if(matrix[row][col]>target){//if target element is lesser than the element then the entire column
                                             // must be less than the element so col--
                    col--;
                }
                else{//if target element is greater than the element then the element in the row is lesser so row++
                    row++;
                }
            }
        return new int[]{-1,-1};}
}
