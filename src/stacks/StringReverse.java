package stacks;

import java.util.Stack;

public class StringReverse {

    public static String reverse(String str){
        Stack<Character> chars = new Stack<Character>();
        for(char x : str.toCharArray())
            chars.push(x);
        StringBuffer reversed = new StringBuffer();
        while(!chars.empty())
            reversed.append(chars.pop());
        return reversed.toString();
    }
}
