package Assignments;

public class Occurence {
    public static void main(String[] args){
        int[]  arr= {1,2,3,4,5,3,6,3};

        int len = arr.length;
        int count =0;
        int occurence =0;

        for (int i = 0; i < len; i++) {
            int a = 0;
            for (int j = 0; j < len; j++) {
                if(arr[i] == arr[j]){
                    a++;
                }
            }

            if( a > count){
                count = a;
                occurence = arr[i];
            }
        }
        System.out.println(occurence);
    }
}
