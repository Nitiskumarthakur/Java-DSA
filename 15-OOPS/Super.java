public class Super {
    public static void main(String[] args) {
        Horse h1 = new Horse();
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        // super.color = "Black";
        super();// they are called the parent constructor.
        System.out.println("Horse constructor is called");
    }
}