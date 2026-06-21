public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SSVM";
        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "UMS";
       
        System.out.println("S1: "+s1.schoolName);

    }
}
class Student{
    String name;
    int rollNo;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}