public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
    }
}

class Animal{
    int name;
    void eat(){
        System.out.println("Eat animals");
    }
    void skin(){
        System.out.println("black Skin");
    }
}
class Dog extends Animal{
    void name(){
        System.out.println("I am a dog");
    }
}
