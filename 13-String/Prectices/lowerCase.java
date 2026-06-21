public class lowerCase {

    public static String Lower(String s){

        StringBuilder results = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !=  Character.toLowerCase(s.charAt(i))){
                char a = Character.toLowerCase(s.charAt(i));
                results.append(a);
            }else{
                results.append(s.charAt(i));
            }
        }
        return results.toString();
    }
    public static void main(String[] args) {
        String s ="Hello";
        System.out.println(Lower(s));
    }
}
