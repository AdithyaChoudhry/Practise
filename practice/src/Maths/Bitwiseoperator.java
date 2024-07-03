package Maths;

public class Bitwiseoperator {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(isodd(68));

    }

    public static boolean isodd(int n){
        return (n & 1)==1;
    }
}
