package Introduction.LinearSearch;

import java.util.Arrays;

public class linearSearch2D {
    public static void main(String[] args) {
        int[][] arr={{43,23,67},{90,54,12},{11,15,63}};
        int target=15;//element is at 2nd row 1 index
        int[] ans = search(arr,target);//storing the answer in another array
        System.out.println(Arrays.toString(ans));
    }
    //static int[] just returning one array so only int[]
    static int[] search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};//we are creating the objects for  the array here which is in line 9 which is initialized
                                          //{i,j}//taking the values of row , colums that is passing i and j
                }
            }
        }
    return new int[]{-1,-1};}//nothing there return -1,-1
}
