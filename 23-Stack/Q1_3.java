//Given the element to add the Button.

import java.util.Stack;

public class Q1_3 {

    public static void pushAtButtom(Stack<Integer> s,int data){

        //Base Case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtButtom(s, data);
        //Backtracking
        s.push(top);
    }

    //Q3 - Reverse the string
    public static void ReverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        ReverseStack(s);
        pushAtButtom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        //pushAtButtom(s,4);
        ReverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
