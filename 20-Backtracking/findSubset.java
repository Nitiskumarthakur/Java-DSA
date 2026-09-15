public class findSubset {

    public static void FindSub(String str, String ans, int i){

        //Base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        //Recursion
        //yes Choice 
        FindSub(str, ans+str.charAt(i), i+1);
        //NO  Choice
        FindSub(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        FindSub(str, "", 0);
    }
}
