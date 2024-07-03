package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
//        patternone(5);
//        patterntwo(6);
//        patternthree(5);
//        patternfour(5);
//        patternfive(5);
//        patternsix(5);
//        patternseven(5);
//        patterneight(5);
//        patternnine(5);
//        patternten(5);
//        pattern11(5);
//        pattern12(5);
//        pattern13(6);
//        pattern14(5);
//        pattern15(5);
        pattern31(4);
    }

    //just three conditions
    //1.see how many rows to print
    //2.see how many columns to print
    //3.see what to print

//            *
//            **
//            ***
//            ****
//            *****

    static void patternone(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//            ******
//            ******
//            ******
//            ******
//            ******
//            ******
    static void patterntwo(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//              *****
//              ****
//              ***
//              **
//              *
    static void patternthree(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j < n-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//
//            1
//            12
//            123
//            1234
//            12345
    static void patternfour(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
//                int sum=0;
//                int c = sum +j;
//                System.out.print(c);

                System.out.print(j);//we can just print the column numbers
            }
            System.out.println();
        }

    }

    static void patternfive(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totatcolsinrow=i>n ? 2*n-i : i;
            for (int j = 0; j <=totatcolsinrow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//             *
//             **
//             ***
//             ****
//             *****

    static void patternsix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=n-i; j++) {//printing the space required
                System.out.print(" ");//0 to 4 space is printed
            }
            for (int j = 0; j <=i; j++) {//and then in the last place astreix is printed
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    ****
//     ***
//      **
//       *


    static void patternseven(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<i; j++) {//print spaces starting no space
                System.out.print(" ");//2 nd row 1 space and so on

            }
            for (int j = i; j <n; j++) {//print 5 starts first

                System.out.print("*");//and then 4 and then 3 so on
            }
            System.out.println();

        }


    }

//            *
//           ***
//          *****

    static void patterneight(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {//use n-i-1 to print spaces
                System.out.print(" ");//that is 5-0-1 = 4 4 spaces printed
            }                         //and then 3 and then 2 and then 1 so on

            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");//use 2*i+1 to print stars in odd numbers
            }
            System.out.println();
        }
    }

//    *****
//     ***
//      *
    static void patternnine(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");//use it to print spaces
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {//use 2*(n-i)-1 to priint 9,7,5,3,1 stars
                System.out.print("*");

            }

            System.out.println();
        }
    }
//
//              *
//             * *
//            * * *
    static void patternten(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//      * * * *
//       * * *
//        * *
    static void pattern11(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=i; j++) {//this prints space
                System.out.print(" ");
            }
            for (int j = 0; j <n-i; j++) {//this prints 5 stars in first line
                System.out.print("* ");//4 in 2nd , 3 in 3rd and so on
            }

            System.out.println();
        }
    }
    //  * * * *
//       * * *
//        * *
    //     *
    //    * *
    //   * * *
    //  * * * *
    static void pattern12(int n){
        for (int i = 0; i <=2*n ; i++) {
            int totalcols = i>n ? 2*n-i : i;

            for (int j = 0; j < totalcols; j++) {
                System.out.print(" ");//prints the space for 10 rows
            }

            for (int j = 0; j <n - totalcols; j++) {//n i totalcols is
                                              //first 5 rows normal i value
                System.out.print("* ");   //last 5 rows takes n - totalcols
            }                           //which is in 6th row-- 5 - (10 -6)= 5- 4 = 1 print 1 start
            System.out.println();   //and 2 star and 3 star so on
        }
    }

    //      *
    //     * *
   //     *   *
   //    *     *
  //    *********
    static void pattern13(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i -1; j++) {
                System.out.print(" ");
            }
            if(i == 0){
                System.out.print("*");
            }

            else if(i==n-1){
                for (int j = 0; j < 2*n-1; j++) {
                    System.out.print("*");
                }
            }

            else{
                System.out.print("*");
                for (int j = 0; j < 2*i -1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*********
    //*      *
    // *    *
    //   * *
    //    *
    static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");//printing the spaces
            }
            if(i==0){
                for (int j = 0; j < 2*n -1; j++) {
                    System.out.print("*");//prints upto n stars in first row
                }
            }
            else if(i==n-1){
                System.out.print("*");//print 1 star in last row
            }
            else {
                System.out.print("*");//print star before spaces in other rows excluding first and last
                for (int j = 0; j < 2*n-(2*i+3); j++) {//print spaces between stars in other rows exclude first and last
                    System.out.print(" ");
                }
                System.out.print("*");//print star before spaces in other rows excluding first and last
            }
            System.out.println();
        }
    }

           //    *
          //   *   *
         //  *       *
        //     *   *
      //         *
    static void pattern15(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>=1){
                for (int j = 0; j < 2*i-1 ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-2; i >=0 ; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i>=1){
                for (int j = 0; j < 2*i-1 ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }


//            0 1 1 1 1 1 1 1 0
//            0 1 2 2 2 2 2 1 0
//            0 1 2 3 3 3 2 1 0
//            0 1 2 3 4 3 2 1 0
//            0 1 2 3 3 3 2 1 0
//            0 1 2 2 2 2 2 1 0
//            0 1 1 1 1 1 1 1 0
//            0 0 0 0 0 0 0 0 0
    static void pattern31(int n){
        int original = n;
        n= 2*n;

        for (int i = 0; i <=n; i++) {//taking upto 2n rows
            for (int j = 0; j <=n; j++) {//taking upto 2n columns
                //up is rows from top
                //left is rows from left
                //right is n - cols travelled so far
                //down is n- rows travlled so far
                //we need to insert values at index based on min of 4 values( (up , left)
                int ateveryindex = Math.min(Math.min(i,j),Math.min(n-i,n-j));
                //first loop (min(0,0) , min(8-0,8-0))==0 in all columns
                //2nd loop (min(1,0) ,min(8-1,8-1))==0
                //2nd loop (min(1,1) , min(8-2,8-2))==1
                //2nd loop last(min(1,8),min(8-8,8-8)) == 0
                 System.out.print(ateveryindex+" ");
//                int ateveryindex2 = original - Math.min(Math.min(i,j),Math.min(n-i,n-j));
               //this prints opposite of it that is 4- 0 4 in outer rows and columns and so on
//                System.out.print(ateveryindex2+ " ");
            }
            System.out.println();
        }
    }

}
