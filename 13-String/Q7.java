public class Q7 {

    // public static void numAdd(String s1, String s2){    
    //     int sum=0;
    //     for(int i=0; i<s1.length();i++){
    //         for(int j=0;j<s2.length();j++){
    //             int n1 = s1.charAt(i)-'0';
    //             int n2 = s2.charAt(j)-'0';
    //             sum = sum+n1+n2;
    //         }
    //     }
    //     System.out.println(sum);
    // }
    public static void numAdd(String s1, String s2) {
        int sum = 0;

        for(int i = 0; i < s1.length(); i++){
            for(int j = 0; j < s2.length(); j++){
                int n1 = s1.charAt(i) - '0';
                int n2 = s2.charAt(j) - '0';

                sum = sum + n1 + n2;
            }
        }

        System.out.println(sum);
    }
    public static void main(String[] args){
        String s1 = "456";
        String s2 = "123";
        numAdd(s1, s2);
    }
}