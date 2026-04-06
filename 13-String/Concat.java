public class Concat {

    public static void printletter(String fullName) {
        
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        //Method-1
        String firstName = "nitish";
        String lastName = "thakur";
        System.out.println(firstName+" "+lastName);

        //Method-2
        String fullName = firstName.concat(" "+lastName);
        System.out.println(fullName);

        printletter(fullName);
    }
}
