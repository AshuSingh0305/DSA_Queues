package DataStructure.Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            queue.add(sc.nextInt());
        }
        reverse(queue);
    }
    public static void reverse(Queue<Integer> queue){
        int i= queue.size();
        int arr [] =new int[i];
        while (!queue.isEmpty()) {
            arr[i - 1] = queue.remove();
            i--;
        }
        for (int j=0;j< arr.length;j++){
            queue.add(arr[j]);
        }
        while (!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
