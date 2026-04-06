// for the given set of String print the lergest String. Lexical Formate.
public class Q3 {
    public static void main(String[] args) {
       String fruite[] = {"apple", "banana", "mango"};

       String largest = fruite[0];
        for(int i=1;i<fruite.length;i++){
            if(largest.compareTo( fruite[i]) < 0){
                largest = fruite[i];
            }
        }
        System.out.println(largest);
    }
}
