package lists;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;
    private int size = 0;

    public LinkedList(){
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if(isEmpty()) {
            first = last = node;
            size++;
            return;
        }
        node.next = first;
        first = node;
        size++;
    }

    public void addLast(int value){
        Node node = new Node(value);
        if(isEmpty()){
            first = last = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }

    public void deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            size--;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            size--;
            return;
        }
        Node current = first;
        while(current.next != last)
            current.next = current;
        current.next = null;
        last = current;
        size--;
    }

    public int[] toArray(){
        int[] arr = new int[size];
        int index = 0;
        var current = first;
        while(current != null){
            arr[index] = current.value;
            index++;
            current = current.next;

        }
        return arr;
    }


// ---------- reverse a liked list in place ----------------------->
    public void reverse(){
        // [10 -> 20 -> 30]
        //  p     c     n
        // n = c.next
        // c.next = p

        if(isEmpty()) return;
        var previous = first;
        var current = first.next;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        last = first;
        last.next = null;
        first = previous;
    }

    // -------------- Find Kth node from end of Linked List in one pass ------------------->
    public int getKthFromTheEnd(int k){
        if(isEmpty())
            throw new IllegalStateException();
        
        var a = first;
        var b = first;
        // move the pointers the correct distance apart
        for(int i = 0; i < k-1; i++) {
            b = b.next;
            if(b == null)
                throw new IllegalArgumentException();
        }
        while (b != last){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    public int size(){
        return size;
    }

    public boolean contains(int target){
        if(isEmpty())
            return false;
        Node current = first;
        while(current != null)
            if(current.value == target)
                return true;
             else current = current.next;
        return false;
    }

    public int indexOf(int target){
        if(isEmpty())
            return -1;
        Node current = first;
        int index = 0;
        while(current != null)
            if(current.value == target)
                return index;
            else {
                current = current.next;
                index++;
            }
        return -1;
    }

    private boolean isEmpty(){
        return first == null;
    }

    private class Node{
        final int value;
        private Node next;
        private Node(int value){
            this.value = value;
        }


    }
}
