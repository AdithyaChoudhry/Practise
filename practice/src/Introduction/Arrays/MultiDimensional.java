package Introduction.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        int[][] Mult = new int[3][3];//if we print lengthof this it will print it as 5 that is the row
        // here we want to specify the row because it is needed
        //column we can specify or not as it is nor necessary

        //ex[ [1,2,3] ,
        //    [4,5], //length of the row can vary
        //    [7,8,9,10] ]

        //in ths if we asked to print Mult[0] it will print [1,2,3]
        //if we asked to print Mult[0][1] it will print [2]

        //this is how we declare 2D arrays that is simply the matrix
//        int[][] Mult1 = {{1,2,3},
//        {4,5,},
//        {7,8,9,10}};

        //taking the inputs :
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < Mult.length; i++) {// it is rows length of the rows
            for (int j = 0; j < Mult[i].length; j++) {//it is colums that is -- inside the rows it calculates another length that is column
                Mult[i][j] = input.nextInt();
            }
        }
        //printing the outputs method 1
        for (int i = 0; i < Mult.length; i++) {// it is rows length of the rows
            for (int j = 0; j < Mult[i].length; j++) {//it is colums that is -- inside the rows it calculates another length that is column
                System.out.print(Mult[i][j]+" ");// using to print the row
            }
            System.out.println();// using these to print in the next line after each row
        }

        //method 2 output
        for (int i = 0; i < Mult.length; i++) {// it is rows length of the rows
            System.out.println(Arrays.toString(Mult[i]));//every single element is array of array itself that is Mult[][] have 2d
                                                         // we mention Mult[i] it itself prints the array of array
        }
        //method 3 enhanced for loop

        for( int [] arr : Mult){//mention the data type is array that is int[]
            System.out.println(Arrays.toString(arr));
        }



    }
}
