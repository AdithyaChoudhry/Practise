package StackandQueues;

public class CustQueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.insert(45);
        queue.insert(55);
        queue.insert(35);
        queue.insert(25);

        queue.display();
    }
}
