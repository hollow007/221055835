package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.StudentSubject;
import za.ac.cput.domain.Subject;
import za.ac.cput.util.StudentHelper;
import za.ac.cput.util.StudentSubjectHelper;

import java.time.LocalDate;

public class StudentSubjectFactory {
    public static StudentSubject buildStudentSubject(Student student, Subject subject, LocalDate enrollmentDate){
        if(StudentSubjectHelper.isNullOrEmpty(student) ||
                StudentSubjectHelper.isNullOrEmpty(subject) ||
                StudentSubjectHelper.isNullOrEmpty(enrollmentDate) ){
            return null;
        }
        return new StudentSubject.StudentSubjectBuilder().setStudent(student)
                .setSubject(subject)
                .setEnrollmentDate(enrollmentDate)
                .buildStudentSubject();
    }
    public static StudentSubject buildStudentSubject(Student student, Subject subject){
        if(StudentSubjectHelper.isNullOrEmpty(student) || StudentSubjectHelper.isNullOrEmpty(subject)){
            return null;
        }
        return new StudentSubject.StudentSubjectBuilder().setStudent(student)
                .setSubject(subject)
                .buildStudentSubject();
    }
}
