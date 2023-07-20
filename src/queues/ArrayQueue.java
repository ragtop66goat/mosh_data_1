package queues;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    public void enqueue(int item){
        if(count == items.length)
            throw new StackOverflowError();
        items[rear] = item;
        // the % items.length makes this a circular array
        rear = (rear + 1) % items.length;
        count++;
    }

    public void dequeue(){
        if(count == 0)
            throw new IllegalStateException();
        items[front] = 0;
        // the % items.length makes this a circular array
        front = (front + 1) % items.length;
        count--;
    }

    public int peek(){
        return items[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == items.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
