import za.ac.cput.domain.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student.StudentBuilder().setStudentNumber("219053324").setFirstName("mpumzi").build();
        System.out.println(student);
    }
}
