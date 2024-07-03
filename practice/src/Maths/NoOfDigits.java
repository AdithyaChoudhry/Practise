package Maths;

public class NoOfDigits {
    public static void main (String[] args){
        int n = 55674;
        int b = 10;

            int ans = (int)(Math.log(n)/Math.log(b)) +1;
        System.out.println(ans);
//        n is set to 4.
//        The expression 1 << (n - 1) is used to perform a left shift on the binary representation of 1 by (4 - 1) positions.
//                The result is then printed to the console.
//                Let's see how the binary representation evolves:
//
//        Binary representation of 1: 0001
//        Left shift by (4 - 1) = 3 positions: 1000
//        So, the result is 8, and the output of the program will be:
//
//        rust
//        Copy code
//        Result of 2^(n-1) for n=4: 8

    }
}
