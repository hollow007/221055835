package za.ac.cput.util;

import za.ac.cput.domain.Student;
import za.ac.cput.domain.Subject;
import java.time.LocalDate;

public class StudentSubjectHelper {

    public static boolean isNullOrEmpty(Student student){
        if(student == null){
            return true;
        }
        return false;
    }

    public static boolean isNullOrEmpty(Subject subject){
        if(subject == null){
            return true;
        }

        return false;
        }

    public static boolean isNullOrEmpty(LocalDate enrollmentDate){
        if(enrollmentDate == null){
            return true;
        }
        return false;
    }
}
