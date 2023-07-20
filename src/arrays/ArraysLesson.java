package arrays;

import java.util.Arrays;

public class ArraysLesson {

    // lookup by index is O(1) time; the fastest
    // insert is O(n)
    // delete best case O(1) when deleting last item, O(n) when deleting first item because all shift
    public static void PrintArraysLesson(){

        int[] numbers = new int[3];
        numbers[0] = 10;

        int[] numbers2 = {10, 0, 0};

        
        System.out.println(Arrays.toString(numbers));
    }



}
