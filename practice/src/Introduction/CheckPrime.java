package Introduction;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        boolean ans = isprime(a);
        System.out.println(ans);

    }


    static boolean isprime(int n){
        if( n <= 1){
            return false;
        }
        // checks for prime here if c * c is less than given n it goes inside the loop and inside if equal to zero it returns false and increases c and then goes on
        int c = 2;
        while ((c * c ) <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        //the code is same as below
        // if ( c* c > n) { return true } else {false }
        return c * c > n;
    }

//    static boolean isprimme2(int a){
//    if( a <=1) {
//        return false;
//    }
//        int c = 2;
//        while((c*c)<a){
//            if(a%c==0){
//                return false;
//            }
//            c++;
//        }
//
//        return c * c > a;
//    }
}
