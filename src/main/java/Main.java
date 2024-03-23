import za.ac.cput.domain.*;
import za.ac.cput.factory.LecturerSubjectFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student=new Student.StudentBuilder().setStudentNumber("219053324").setFirstName("mpumzi").build();
        LecturerSubject lecturerSubject = new LecturerSubject.LecturerSubjectBuilder().setContractType("Part-Time").build();
        System.out.println(student);
        System.out.println(lecturerSubject);


        Subject subject  = new Subject.SubjectBuilder().setSubjectCode("ADP3")
                .setSubjectName("Applications Development Practice 3")
                .setDuration("3 years")
                .setEnrollmentCapacity(150)
                .setSubjectCredits(30)
                .buildSubject();

        System.out.println(subject);
        StudentSubject stdSubj = new StudentSubject.StudentSubjectBuilder().setStudent(student).setSubject(subject).buildStudentSubject();
        System.out.println(stdSubj);


        Lecturer lecturer = new Lecturer.Builder().build();
        subject = new Subject.SubjectBuilder().buildSubject();

        LocalDate assignmentDate = LocalDate.of(2023, 1, 15);
        String contractType = "Full-time";
        String roomNumber = "105";

        lecturerSubject = LecturerSubjectFactory.createLecturerSubject(lecturer, subject, assignmentDate,
                contractType, roomNumber);

        System.out.println(lecturerSubject.toString());
    }
}
