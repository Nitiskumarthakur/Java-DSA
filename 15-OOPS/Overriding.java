public class Overriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();

        Dog d1 = new Dog();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("In the Animal eat function");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("In the dog eat function");
    }
}