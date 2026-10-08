//Implement the Stack with the help of ArrayList.

import java.util.ArrayList;

public class ArrayList_Imple{
    static class stack{

        static ArrayList<Integer> list = new ArrayList<>();
        //to add value
        public static void push(int data){
            list.add(data);
        }
        //to Remove the value 
        public static int pop(){
            int num = list.get(list.size()-1);
            list.remove(list.size()-1);
            return num;
        }
        //to Peek the element 
        public static int peek(){
            return list.get(list.size()-1);
        }
        //to Chack is Empty.
        public  static boolean isEmpty(){
            return list.size() == 0;
        }
        
    }
    public static void main(String[] args) {
        //stack s = new stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
         
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
    }
}