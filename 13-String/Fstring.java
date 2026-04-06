import java.util.Scanner;

public class Fstring {
    public static void main(String args[]){
        //String name = "Nitish Kumar Thakur";
        //System.out.println("Name Length: "+ name.length());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String n = sc.nextLine();
        System.out.println("Your Name is: "+ n+" And Name Length: "+ n.length());
        
        sc.close();
       
    } 
}
