package Introduction;

import java.util.Arrays;

public class VariableLengthargs {
    public static void main(String[] args) {
        add(5 , 6 , 7 , 8 );
        Show(5,6,"Rajesh","Ramesh");
    }
    //variable Length arguments are used to give the values when we dont know how many times we give it it take the array og values
    //array of integers or array of Strings etc..
    static void add (int ...v){
        System.out.println(Arrays.toString(v));
    }
    //variable length arguments should be always declared at the last
    static void Show( int a , int b , String ...v){
        System.out.println(a + "" + b +"" + Arrays.toString(v));
    }
}
