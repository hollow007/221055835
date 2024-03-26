package za.ac.cput.util;

import za.ac.cput.domain.Lecturer;
import za.ac.cput.domain.LecturerSubject;
import za.ac.cput.domain.Subject;

import java.time.LocalDate;

/* LecturerSubjectHelper.java
   LecturerSubjectHelper class
   Author: Cavan Ramone Swartz (221055835)
   Date: 23 March 2024
   https://github.com/hollow007/mystudentregistrationapplication
 */
public class LecturerSubjectHelper {

    public static boolean isNullOrEmpty(String s){
        if (s == null || s.isEmpty())
            return true;
        return false;
    }

    private static boolean isNullOrEmpty(double salary) {
        return false;
    }

    public static boolean isLecturerNullOrEmpty(Lecturer lecturer) {
        if (lecturer == null) {
            return true;
        }
        if (isNullOrEmpty(lecturer.getEmployeeId()) ||
                isNullOrEmpty(lecturer.getFirstName()) || isNullOrEmpty(lecturer.getLastName())  || isNullOrEmpty(lecturer.getGender())
                || isNullOrEmpty(lecturer.getSalary())
        )
        {
            return true;
        }

        return false;

    }

    /*private static boolean isNullOrEmpty(String firstName) {
        return false;
    }*/

    public static boolean isSubjectNullOrEmpty(Subject subject) {
        if (subject == null) {
            return true;
        }
        if (isNullOrEmpty(subject.getSubjectCode()) ||
                isNullOrEmpty(subject.getSubjectName()) || isNullOrEmpty(subject.getDescription())  || isNullOrEmpty(subject.getDuration())
                || isNullOrEmpty(subject.getSubjectCredits())  || isNullOrEmpty(subject.getEnrollmentCapacity())
        )
        {
            return true;
        }

        return false;

    }


    public static boolean isNullOrEmpty(LocalDate assignmentDate) {
        return false;
    }

    public static boolean isLecturerSubjectNullOrEmpty(LecturerSubject lecturerSubject) {
        return false;
    }
}
