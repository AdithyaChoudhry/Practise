package Assignments;

public class DiagonalMatrix {
    public static void main(String[] args) {
 int[][] matrix = {{1,2,3},
                   {4,5,6},
                   {7,8,9}};
//        int[][] matrix = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int sum =0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sum+=matrix[i][i] + matrix[i][n-i-1];
        }
        if(n%2!=0){
            sum-=matrix[n/2][n/2];
        }
        System.out.println(sum);}
}
