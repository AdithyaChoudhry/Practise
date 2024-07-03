package Introduction.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {45,67,89,34,56,12,21};
         linearsearch(arr,56);

    }

    static int linearsearch(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                System.out.println(arr[i]+ " Element foundedat index "+i);;
            }
        }

        //enhanced for loop
//        for ( int element : arr){//indicates all elements in array
//            if(element==target){
//                return element;
//            }
//        }
    return  -1;}
}
