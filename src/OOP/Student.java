package OOP;

public class Student {
    String name;
    int roll_no;

    public  void studentInfo(){
        System.out.println("Student Name :"+name);
        System.out.println("Student Roll_no :"+roll_no);
    }


    public static void main(String[] args) {
        Student  student = new Student();
        student.name="John";
        student.roll_no=2;
        student.studentInfo();
    }
}

