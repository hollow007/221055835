package za.ac.cput.factory;

import za.ac.cput.domain.LecturerSubject;
import za.ac.cput.domain.Lecturer;
import za.ac.cput.domain.Subject;
import za.ac.cput.util.LecturerSubjectHelper;

import java.time.LocalDate;

/* LecturerSubjectFactory.java
   LecturerSubjectFactory class
   Author: Cavan Ramone Swartz (221055835)
   Date: 23 March 2024
   https://github.com/hollow007/221055835
 */
public class LecturerSubjectFactory {
    public static LecturerSubject buildLecturerSubject(Lecturer lecturer, Subject subject, LocalDate assignmentDate,String contractType, String roomNumber) {
        if(LecturerSubjectHelper.isLecturerNullOrEmpty(lecturer)||
                LecturerSubjectHelper.isSubjectNullOrEmpty(subject)||
                LecturerSubjectHelper.isNullOrEmpty(assignmentDate)||
                LecturerSubjectHelper.isNullOrEmpty(contractType)||
                LecturerSubjectHelper.isNullOrEmpty(roomNumber)){
            return null;
        }
        return new LecturerSubject.LecturerSubjectBuilder()
                .setLecturer(lecturer)
                .setSubject(subject)
                .setAssignmentDate(assignmentDate)
                .setContractType(contractType)
                .setRoomNumber(roomNumber)
                .build();
    }
}

