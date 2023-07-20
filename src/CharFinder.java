import java.util.*;

public class CharFinder {
    public static char getFirstNonRepeatedNumber(String input){

        Map<Character, Integer> map = new HashMap<>();
        var chars = input.toCharArray();

        for(var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars)
            if(map.get(ch) == 1)
               return ch;
        return Character.MIN_VALUE;
    }

    public char getFirstRepeatedCharacter(String input){
        Set<Character> set = new HashSet<>();

        for(var ch : input.toCharArray()){
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }

        return Character.MIN_VALUE;
    }

    public void getUniqueSetWithStream(int[] input){
        Integer[] numbers = {1, 2, 3, 2, 1, 4};

        Set<Integer> unique = new HashSet<>();

        Collections.addAll(unique,numbers);

        System.out.println(unique);
    }
}
