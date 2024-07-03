package StackandQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Queueinbuilt {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(6);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
    }
}
