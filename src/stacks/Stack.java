package stacks;

import java.util.Arrays;

public class Stack {
    private int count = 0;
    private int[] items = new int[5];

    public void push(int item){
        if(items.length == count)
            throw new StackOverflowError();
        items[count++] = item;
    }

    public int pop(){
       if(count == 0)
           throw new IllegalStateException();
       return items[--count];
    }

    public int peek(){
        if(count == 0)
            throw new IllegalStateException();
        return items[count -1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        int[] content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

}
