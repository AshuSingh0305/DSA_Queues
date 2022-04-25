package DataStructure.Queues;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class QueueImplementationUsingArray {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.dequeue();
        System.out.println(arrayQueue);
    }
}

class ArrayQueue{
    private int front=0;
    private int rear=0;
    private int count=0;
    private int [] array;
    public ArrayQueue(int size){
        array = new int[size];
    }

    public void enqueue(int item){
        if(count == array.length){
            throw new IllegalStateException();
        }
        array[rear]=item;
        rear = (rear+1)%array.length;
        count++;
    }

    public int dequeue(){
        if(count == 0){
            throw new NullPointerException();
        }
        int value = array[front];
        array[front] = 0;
        front = (front+1)%array.length;
        count--;
        return value;
    }
    public boolean isEmpty(){
        return count ==0;
    }
    public boolean isFull(){
        return count == array.length;
    }

    public int peek(){
        return array[front];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);

    }

    public void print(){
        for(int i= front ; i< rear ; i++){
            System.out.print(array[i]+" ");
        }
    }
}