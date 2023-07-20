package arrays;

import java.util.Arrays;

public class Array {
    private int[] array;
    int items = 0;

    public Array(int size){
        this.array = new int[size];
    }

    public void insert(int item){
        if(items == array.length){
            int[] temp = new int[items*2];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array=temp;
        }
        array[items] = item;
        items++;
    }

    public void print(){
        for(int i = 0; i < items; i++){
            System.out.println(array[i]);
        }
    }

    public int indexOf(int item){
            for(int i = 0; i < items; i++) {
                if (array[i] == item)
                    return i;
            }
        return -1;
    }

    public void removeAt(int index){
        if(index < 0 || index >= items)
            throw new IllegalArgumentException();
        for(int i = index; i < items; i++)
            array[i] = array[i+1];
        items--;
    }
}
