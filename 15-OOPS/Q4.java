public class Q4 {
    //Import Question. 
    public static void main(String[] args) {
        Vahicle v1 = new Car();
        //v1.print1(); //Error Bacuse print1 is not a Method of the vahicle.
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
    void print1(){
        System.out.print("Derived class(Car)");
    }
}


