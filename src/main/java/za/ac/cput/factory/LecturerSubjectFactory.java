package za.ac.cput.factory;

import za.ac.cput.domain.LecturerSubject;
import za.ac.cput.domain.Lecturer;
import za.ac.cput.domain.Subject;

import java.time.LocalDate;

/* LecturerSubjectFactory.java
   LecturerSubjectFactory class
   Author: Cavan Ramone Swartz (221055835)
   Date: 23 March 2024
   https://github.com/hollow007/221055835
 */
public class LecturerSubjectFactory {
    public static LecturerSubject createLecturerSubject(Lecturer lecturer, Subject subject, LocalDate assignmentDate,
                                                        String contractType, String roomNumber) {
        return new LecturerSubject.LecturerSubjectBuilder()
                .setLecturer(lecturer)
                .setSubject(subject)
                .setAssignmentDate(assignmentDate)
                .setContractType(contractType)
                .setRoomNumber(roomNumber)
                .build();
    }
}