package pack1;

public class Student {
    int s_rollno = 001;
    String s_name = "John Doe";
    String s_address = "123 Main Street";
    private int s_age = 20;
    int semester = 2;
    String Email = "john.doe@example.com";
    int s_phone;

    protected void displayStudentInfo() {
        System.out.println("Student Roll No: " + s_rollno);
        System.out.println("Student Name: " + s_name);
        System.out.println("Student Address: " + s_address);
        System.out.println("Student Age: " + s_age);
        System.out.println("Semester: " + semester);
        System.out.println("Email: " + Email);
        System.out.println("Phone: " + s_phone);
    }

    
}
