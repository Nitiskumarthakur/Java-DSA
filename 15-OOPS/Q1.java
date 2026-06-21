// To assigne the value of name, marks.
public class Q1{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "NitishTakur";
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int marks;
}