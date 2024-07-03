package OOPS.Generics;

import java.util.Arrays;

public class CustomArray {
    //the problem here is we can use this only for integer , we cannnot use it for other data types etc
    //To solve this issue we use generics here which says which type we are using
    private int[] Array ;
    private static int Default_size = 10;
    private int Size=0;

    public CustomArray(){
        this.Array = new int[Default_size];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        Array[Size++] = num;
    }

    private boolean isFull(){
          return Size == Array.length;
    }

    private  void resize(){
        int[] temp = new int[Array.length * 2];
        for (int i = 0; i < Array.length; i++) {
            temp[i] = Array[i];
        }
              Array = temp;
    }

    public int remove(){
        int remove = Array[Size--];
        return remove;
    }

    public int get(int index){
        return Array[index];
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
               CustomArray obj1 = new CustomArray();
               obj1.add(5);
               obj1.add(6);
               obj1.remove();
               obj1.add(7);
        System.out.println(obj1.get(0));
                obj1.Size();
                CustomArray obj2 = new CustomArray();
                for (int i=0 ; i< 15 ; i++){
                    obj2.add(2 * i);
                }
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
