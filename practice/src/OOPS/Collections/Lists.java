package OOPS.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) {
        List<Integer> obj1 = new ArrayList<>();//here Array list is extending or implemeneting the List so List is a parent and Arraylist is a child
        List<Integer> obj2 = new LinkedList<>();//here Linked list is extending or implemeneting the List so List is a parent and Arraylist is a child

        obj1.add(9);
        obj2.add(6); //same for Linked and Arraylist both

        //vectors can access only one thread at a time not multiple threads
        //where as Arraylist can access multiple threads at a time

        List<Integer> obj3 = new Vector<>();

        obj3.add(8);//it is slower than Array list  , recommended using of Array List if Multithreading given
    }
}
