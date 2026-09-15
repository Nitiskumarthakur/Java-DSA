public class Permutation {

    public static void findPermutation(String str, String ans){

        //Base Case.
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //to work
        for(int i=0;i<str.length();i++){
            char curChar = str.charAt(i);// to current Character.
            String newString = str.substring(0, i)+str.substring(i+1);
            findPermutation(newString, ans+curChar);
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        String ans = "";
        findPermutation(str, ans);
    }
}
