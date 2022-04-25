package DataStructure.Queues;

import java.util.Stack;

public class QueueStacks {
    public static void main(String[] args) {
        StacksQueue stacksQueue = new StacksQueue();
        stacksQueue.enqueue(10);
        stacksQueue.enqueue(20);
        stacksQueue.enqueue(30);
        stacksQueue.dequeue();
        stacksQueue.enqueue(40);
        stacksQueue.dequeue();
        stacksQueue.enqueue(50);
        stacksQueue.enqueue(60);
        stacksQueue.enqueue(70);

//        stacksQueue.enqueue(80);
        stacksQueue.print();
        stacksQueue.peek();
        stacksQueue.print();

    }

}
class StacksQueue{
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    static int count=0;
    static int size=5;
    public void enqueue(int item){
        if(size==count){
            throw new IllegalStateException();
        }
        stack.push(item);
        count++;
    }
    public void dequeue(){
        while(count > 1){
            stack2.push(stack.pop());
            count--;
        }
        stack.pop();
        count=0;
        while (!stack2.isEmpty()){
            stack.push(stack2.pop());
            count++;
        }
    }
    public void peek(){
        while (!stack.isEmpty()){
            stack2.push(stack.pop());
        }
        System.out.println(stack2.peek());
        while (!stack2.isEmpty()){
            stack.push(stack2.pop());
        }
    }
    public void print(){
        System.out.println(stack);
    }

}
