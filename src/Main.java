import hashTables.HashTable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(1, "A");
        table.put(5, "B");
        table.put(11, "c");
        table.put(1, "A+");

        System.out.println(table.get(1));
    }

    public static void reverse(Queue<Integer> que){
        Stack<Integer> stack = new Stack();
        while( !que.isEmpty()){
            int first = que.remove();
            stack.push(first);
        }

        while(!stack.empty()){
            int top = stack.pop();
            que.add(top);
        }

    }



    public static String returnOdds(String numbers){
        String odds = IntStream.range(0, numbers.length())
                .filter(i -> i%2 == 0)
                .mapToObj(i -> numbers.charAt(i))
                .map(Object::toString)
                .collect(Collectors.joining(""));
        return odds;
    }

    public static void log(int[] array){
        //O(1)
        System.out.println(array[0]);
    }

    public static void loopTime(int[] array){
        // O(n) where n grows linearly
        // O(1) space. only additional memory is for the loop variable
        for (int num : array){
            System.out.println(num);
        }
    }

    public static void loopTime2(int[] array){
        // O(2n) where n grows linearly
        for (int num : array){ //O(n)
            System.out.println(num);
        }

        for (int num : array){ //O(n)
            System.out.println(num);
        }
    }

    public static void loopTime3(int[] array, String[] names){
        // O(n^2)
        for (int num : array){ //O(n)
            for (String name : names){ //O(n)
                System.out.println(name);
            }
        }
    }

    public static void printNames(String[] names){

        //O(n) space. Additional memory for size of copy/names
        String[] copy = names;

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }


}