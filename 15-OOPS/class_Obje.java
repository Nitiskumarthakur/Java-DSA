public class class_Obje{
    public static void main(String[] args) {
        Pen p1 = new  Pen();
        p1.setColor("Black");
        System.out.println(p1.color);

        
        Bank b1 = new Bank();
        b1.user = "kumar";
        b1.setPassword("1234"); 
        System.out.print(b1.getPassword());
    }

}
class Bank{
    public String user; // Here the defined the public Access Modifiers.
    private String password;

    public void setPassword(String newPassword){ //defind the setter.
        password = newPassword;
    }
    public String getPassword(){ //defind the getter.
        return password;
    }
}
class Pen{
    String color;
    int tips;
    void setColor(String newColor){
        color = newColor;
    }

    void setTips(int newTips){
        tips = newTips;
    }
}