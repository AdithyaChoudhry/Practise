package Maths;

public class xoroperator {
    public static void main(String[] args) {
        int[] values ={1,2,3,1,2,3,4};
        System.out.println(frequency(values));

    }

    public static int frequency(int [] arr){
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result^=arr[i];}

    return result;}
}
