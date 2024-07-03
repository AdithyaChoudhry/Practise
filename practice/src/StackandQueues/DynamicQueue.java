package StackandQueues;

public class DynamicQueue extends Circularqueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }


    @Override
    public boolean insert(int item){
        if(this.isFull()){
            int[] temp = new int[data.length*2];
             front=0;
             end= data.length;;
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[((front+i)% data.length)];
            }
            data=temp;
        }
        return super.insert(item);
    }

}
