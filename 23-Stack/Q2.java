//Reverse a String Using the stack. 

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "abc";
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           s.push(ch);
        }
        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            sb.append(s.pop());
            //System.out.println(s.peek());
            // s.pop();
        }
        String results = sb.toString();
        System.out.println("NewString: "+results);
    }
}
