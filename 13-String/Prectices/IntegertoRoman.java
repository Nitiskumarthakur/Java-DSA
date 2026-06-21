public class IntegertoRoman {

    public static String intToRoman(int num){
          
        int value[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbol[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        StringBuilder re = new StringBuilder();

        for(int i=0; i<value.length;i++){
            while(num >= value[i]){
                re.append(symbol[i]);
                num-=value[i];
            }
        }
        return re.toString();
    }
    public static void main(String[] args) {
        int num=1943;
        System.out.println(intToRoman(num));
    }
}
