package queues;

import java.util.Stack;

public class QueueWithTwoStacks {

    private final Stack<Integer> first = new Stack<>();
    private final Stack<Integer> second = new Stack<>();

    public void enqueue(int item){
        first.push(item);
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        moveFirstToSecond();

        return second.pop();
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        moveFirstToSecond();
        return second.peek();
    }

    private void moveFirstToSecond() {
        if(second.isEmpty())
            while(!first.empty())
                second.push(first.pop());
    }

    public boolean isEmpty(){
        return (first.empty() && second.empty());
    }
}
