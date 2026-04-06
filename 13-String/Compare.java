public class Compare {
    public static void main(String[] args) {
        String s1 = "nitish";
        String s2 = "nitish";
        String s3 = new String("nitish");

        if(s1 == s2){
            System.out.println("equal String");
        }else{
            System.out.println("not Equal");
        }
        if(s1 == s3){
            System.out.println("s1 and s3 is equal");
        }else{
            System.out.println("s1 and s3 is NOT equal");
        }

        if(s1.equals(s3)){
            System.out.println("Using the EQUALS function s1 and s3 is equal");
        }
    }
}
