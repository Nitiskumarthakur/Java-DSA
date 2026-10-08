import java.util.Stack;

public class Q6 {
    
    //Check is Valid parenthese.
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            //Openign brackets
            if(ch == '(' || ch == '[' || ch =='{'){
               s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                // To check the Closing brackets.
                if(s.peek() == '(' && ch == ')' || s.peek() == '[' && ch == ']' ||
                   s.peek() == '{' && ch == '}'){
                   s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    //Duplicate parenthese.
    //((a+B));
    public static boolean duplicateParentiese(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ')'){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return true;
                }
                int count = 0;
                while(s.peek() != '('){
                    count++;
                    s.pop();
                }
                if(count < 1){
                    s.pop();
                    return true;
                }
                s.pop(); 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //System.out.println(isValid("{}[]("));
        
        System.out.println(duplicateParentiese(")"));
    }
}
