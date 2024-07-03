package StackandQueues;

public class Customstack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
  int ptr = -1;
    public Customstack(){
        this(DEFAULT_SIZE);
    }

    public Customstack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("cannot pop from empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;

    }
}

