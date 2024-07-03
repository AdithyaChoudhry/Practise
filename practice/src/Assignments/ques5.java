package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ques5 {

    public static List<Integer> nextgreater(int[] arr){
        //firs list for storing the resukt
        List<Integer> list = new ArrayList<>();

        //stack

        Stack<Integer> stack = new Stack<>();

        for(int i=0 ; i<arr.length;i++){
            if(stack.isEmpty() || arr[i] < stack.peek()){
                stack.push(arr[i]);
            }
            else{
                while(!stack.isEmpty() && stack.peek() <arr[i]){
                    list.add(arr[i]);
                    stack.pop();
                }
                stack.push(arr[i]);
            }
        }
        while(!stack.empty()){
            list.add(0);
            stack.pop();
        }
        return list;
    }

    public static  void main(String[] args){
        System.out.println(nextgreater(new int[]{4,5,7,3,2,11}));
    }
}
