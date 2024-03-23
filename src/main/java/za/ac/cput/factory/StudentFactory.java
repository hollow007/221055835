package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Student;
import za.ac.cput.util.StudentHelper;

public class StudentFactory {
    public static Student buildStudent(String studentNumber, String idNumber, String firstName, String lastName, String gender, String ethnicity,  Contact contact ){
        if(StudentHelper.isNullOrEmpty(studentNumber)||
                StudentHelper.isNullOrEmpty(idNumber)||
                StudentHelper.isNullOrEmpty(firstName)||
                StudentHelper.isNullOrEmpty(lastName)||
                StudentHelper.isNullOrEmpty(gender)||
                StudentHelper.isNullOrEmpty(ethnicity)||
        StudentHelper.isContactNullOrEmpty(contact)){
            return null;
        }
        return new Student.StudentBuilder().setStudentNumber(studentNumber).
                setIdNumber(idNumber).
                setFirstName(firstName).
                setLastName(lastName).
                setGender(gender).
                setEthnicity(ethnicity).
                setContact(contact).
                build();
    }
}
