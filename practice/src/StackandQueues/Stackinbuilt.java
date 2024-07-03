package StackandQueues;

import java.util.Stack;

public class Stackinbuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(24);
        stack.push(14);
        stack.push(74);
        stack.push(54);
        stack.push(64);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
