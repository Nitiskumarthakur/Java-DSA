// You are given a number (eg - 2019), convert it into a String of english like 
// “two zero one nine”. Use a recursive function to solve this problem. 
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number 
// can’t be 0.
public class q2 {

    public static String convertString(int num,String str){
        String strArray[] = {"zero","one", "two","three","four","five","six","seven","eight","nine"};
        
        if(num == 0){
            return str;
        }
        int idx = num%10; //find last index
        num = num/10; //remove the last Digit.
        str = strArray[idx]+" "+str;
        String newString = convertString(num, str);
        return newString;
    }
    public static void main(String[] args) {
        int num=2019;
        String str = "";
        System.out.println(convertString(num, str));
    }
}
