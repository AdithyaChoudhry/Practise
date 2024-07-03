package Introduction.LinearSearch;

public class Minimumelement {
    public static void main(String[] args) {
          int[] arr = {45,67,89,76,45,23};
        System.out.println(linearsearchmin(arr));
    }
    //array length is !=0 becasue we want to search it
    static int linearsearchmin(int[] arr){
        int ans = arr[0];//initially keeping it as 0th index value
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];//basically stores the lesser element comparing with the new one
            }
        }
    return ans;}
}