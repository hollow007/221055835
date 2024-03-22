import za.ac.cput.domain.LecturerSubject;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.Subject;

public class Main {
    public static void main(String[] args) {
        Student student=new Student.StudentBuilder().setStudentNumber("219053324").setFirstName("mpumzi").build();
        LecturerSubject lecturerSubject = new LecturerSubject.LecturerSubjectBuilder().setContractType("Part-Time").build();
        System.out.println(student);
        System.out.println(lecturerSubject);


        Subject subject  = new Subject.SubjectBuilder().setSubjectCode("ADP3")
                .setSubjectName("Appications Develpments Practice 3")
                .setDuration("3 years")
                .setEnrollmentCapacity(150)
                .setSubjectCredits(30)
                .buildSubject();

        System.out.println(subject);

    }
}
