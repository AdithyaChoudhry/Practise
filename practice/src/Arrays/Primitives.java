package Introduction.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[7];    //each element in the heap as separate object and stored in non continuous manner

        //int[] arr basically refering to the type int[] array in stack memory at compile time
        //new int[of size] is creating object in the heap memory at run time that is dynamic memory allocation
        //new is used to create object
        //1.Array objects are stored in heap5
        //2.heap objects are not continuous
        //3.Array may be continuous -- but in java it may be non continuous as it depends on jvm


        //decalre like this
        arr[0] = 1;
        System.out.println(arr[0]);

        //or else

        //method 1
        for (int i = 0; i < arr.length; i++) {//use arr.length as we do not know the length of the array all the times
            arr[i] = input.nextInt();
            change(arr);//basically it changes the value because both are referring to the same object
                          //arrays are mutable
            System.out.println(arr[i]);
        }

        //method 2
        for (int num : arr){//num here represents the elements in the array
            System.out.println(num);
        }

        //method 3
        System.out.println(Arrays.toString(arr));
        //above are array of primitives
        //each element in the heap as separate object and stored in non continuous manner


    }
    static void change(int[] nums){
        nums[2]=56;//basically it changes the value because both are referring to the same object
                   //arrays are mutable
    }
}
