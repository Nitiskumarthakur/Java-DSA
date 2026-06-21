// Interface the blue print of the Class.
public class Interface {
    public static void main(String[] args) {
       Queen q1 = new Queen();
       q1.moves(); 

       Bear b1 = new Bear();
       b1.herbivore();
       b1.canrivore();
    }
}

interface Herbivore{
    void herbivore();
}
interface Carnivore{
    void canrivore();
}
class Bear implements Herbivore, Carnivore{
    public void herbivore(){
        System.out.println("I am herbivore");
    }
    public void canrivore(){
        System.out.println("I am canrivore");
    } 
}
//singal Interface
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}
class king implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal by one step");
    }
}