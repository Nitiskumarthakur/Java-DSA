public class Contractor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nitish";
        s1.rollNo = 123;
        // Student s3 = new Student(123);
        Student s2 = new Student(s1);
        System.out.print(s2.name);
    }
}


class Student {
    String name;
    int rollNo;
    
    //Copy constractor
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }

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
