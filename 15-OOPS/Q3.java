//Import Question. 
public class Q3 {
    public static void main(String[] args) {
        Vahicle v1 = new Car();
        v1.print();//print Derived Bacause Using the Method overriding.
        Vahicle v2 = new Vahicle();
        v2.print();
    }
}
class Vahicle{
    void print(){
        System.out.print("Base class(Vahicle)");
    }
}
class Car extends Vahicle{
    void print(){
        System.out.print("Derived class(Car)");
    }
}
