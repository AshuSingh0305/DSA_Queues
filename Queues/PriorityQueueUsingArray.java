package DataStructure.Queues;

import java.util.Arrays;

public class PriorityQueueUsingArray {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.insert(4);
    }
}
class PriorityQueue{
    private int [] arr = new int[5];
    public void insert(int item){
        arr[0]=1;arr[1]=3;arr[2]=5;arr[3]=7;
        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]>item){
                arr[i+1]=arr[i];
            }else {
                arr[i+1]=item;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
