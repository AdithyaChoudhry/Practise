package Maths;

public class checkpowerof2 {
    public static void main(String[] args){
        int n= 8;
        boolean ans = (n & (n-1))==0;
        //n and n -1 -- & operation result 0 means answer is 2 that is number will be in power of 2

        System.out.println(ans);
    }
}
