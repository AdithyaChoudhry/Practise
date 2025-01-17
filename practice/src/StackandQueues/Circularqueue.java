package StackandQueues;

public class Circularqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
int front =0;
int size =0;

    public Circularqueue(){
        this(DEFAULT_SIZE);
    }

    public Circularqueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");

        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }

        int i=front;
        do{
            System.out.println(data[i]+"->");
            i++;

            i %= data.length;
        }while(i!=end);
            System.out.println("END");
        }
    }


