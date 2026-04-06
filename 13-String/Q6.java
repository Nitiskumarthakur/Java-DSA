public class Q6 {

    public static void toCount(String str){

        int count =0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == 'I'){
                count+=1;
                
            }else if(str.charAt(i) == 'V'){
                count+=5;
                 
            }else if(str.charAt(i) == 'X'){
                count+=10;
                  
            }else if(str.charAt(i) == 'L'){
                count+=50;
                 
            }else if(str.charAt(i) == 'C'){
                count+=100;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String str = "CIII";
        toCount(str);
    }
}
