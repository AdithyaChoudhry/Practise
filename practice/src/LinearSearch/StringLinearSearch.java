package Introduction.LinearSearch;

import java.util.Arrays;

public class StringLinearSearch {
    public static void main(String[] args) {
          String name = "Ramesh";
        //  char target= "r";
        char target = 'r';
        System.out.println(search(name,target));//for target use ' ' single quotes as char uses that
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str , char target){
        if(str.length()==0){//in array we specify length variable , here it is length() --> which is also internally have length
            return false;
        }
        //for loop
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        //enhanced for loop
        for (char c : str.toCharArray()) {//char array basically means this [r , a, m ,e , s, h]
            if(c==target){
                return true;
            }
        }
    return false ;
    }
}
