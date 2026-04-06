// for a given String convert each the first letter of each word to upperCase.
public class Q4 {

    // public static String firstLettertoUpper(String a){
    // String b = a.substring(0, 1).toUpperCase() + a.substring(1);
    // return b;
    // }

    public static String toStringUpper(String str) {

        StringBuilder sc = new StringBuilder("");
        char a = Character.toUpperCase(str.charAt(0));
        sc.append(a);

        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == ' ' && i < str.length() - 1){
                
                sc.append(" ");
                i++;
                sc.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sc.append(str.charAt(i));
            }
        }
        return sc.toString();
    }

    public static void main(String[] args) {
        String a = "hi I am nitish";
        System.out.println(toStringUpper(a));

    }
}
