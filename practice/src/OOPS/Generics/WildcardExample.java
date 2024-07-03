package OOPS.Generics;

import java.util.Arrays;
import java.util.List;

public class WildcardExample <T> {//<T> T - here refers to int or String
    //the problem here is we can use this only for integer , we cannnot use it for other data types etc
    //To solve this issue we use generics here which says which type we are using


    //Wildcard here is that we can use particular type of datatype
    //for example we can pass only type number
    //tp do that  change <T> to <T extends Number>  Now it can pass only Integer or float or Number types Not the string types
    //A classical example is listed in line 22
    private Object[] Array ;//we are creating an object instead of datatypes
    private static int Default_size = 10;
    private int Size=0;

    public WildcardExample(){
        this.Array = new Object[Default_size];
    }

    //Wildcard

    public void fun(List<Number> list){
        //do something

        //like if we use just the Number we can pass only the Number type

        //if we change it to <? extends Number> now we can pass Integer or float or something of Number type
    }

    public void add(T num){//T is what we datatype we are using
        if(isFull()){
            resize();
        }
        Array[Size++] = num;
    }

    private boolean isFull(){
        return Size == Array.length;
    }

    private  void resize(){
        Object[] temp = new Object[Array.length * 2];//replacing with the Objectarray instead of T because T cannot be instantiated directly not allowed in Generics
        for (int i = 0; i < Array.length; i++) {
            temp[i] = Array[i];
        }
        Array = temp;
    }

    public T remove(){
        T remove = (T) (Array[Size--]);//Casting is Done here because inserting a large inside the smaller one
        return remove;
    }

    public T get(int index){
        return (T)(Array[index]);//Casting is Done here because inserting a large inside the smaller one
    }

    public int Size(){
        return Size;
    }

    @Override// overriding the tostring method that is instead of writing obj1.something in sout we override it and just write the obj alone
    public String toString() {
        return "CustomArray{" +
                "Array=" + Arrays.toString(Array) +
                ", Size=" + Size +
                '}';
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list = new WildcardExample<>();
        list.add(5);
        System.out.println(list);
        WildcardExample<String> list2 = new WildcardExample<>();
        list2.add("Created Array");
        System.out.println(list2);
    }
}
