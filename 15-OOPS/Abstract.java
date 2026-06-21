public class Abstract {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
    }
}
abstract class Animal{
    String color;
    Animal(){
        this.color= "brown";
    }
    void eat(){
        System.out.println("Animals Eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Horse walk on four leg");
    }
}
class Hen extends Animal{
    void walk(){
        System.out.println("Hen walk on the two leg");
    }
}