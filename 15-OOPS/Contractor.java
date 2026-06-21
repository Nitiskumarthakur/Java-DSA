public class Contractor {
    public static void main(String[] args) {
        Student s2 = new Student();
        Student s1 = new Student("NitishThakur");
        System.out.println(s1.name);
        Student s3 = new Student(123);
    }
}


class Student {
    String name;
    int rollNo;
    
    Student(){
    System.out.print("This is the process celled the constractor.");
    }
    Student(String name) {
        this.name = name;
    }
    Student(int rollNo){
        this.rollNo = rollNo;
    }
}
