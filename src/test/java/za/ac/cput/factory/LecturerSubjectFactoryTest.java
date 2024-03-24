package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Lecturer;
import za.ac.cput.domain.LecturerSubject;
import za.ac.cput.domain.Subject;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
/* LecturerSubjectFactoryTest.java
   LecturerSubjectFactoryTest class
   Author: Cavan Ramone Swartz (221055835)
   Date: 23 March 2024
   https://github.com/hollow007/221055835
 */

class LecturerSubjectFactoryTest {

    Lecturer lecturer;

    Subject subject;

    LocalDate assignmentDate;

    String contractType;

    String roomNumber;

    @Test
    void buildLecturerSubjectNullChecks() {
        // Test with null lecturer
        Exception exception1 = assertThrows(IllegalArgumentException.class, () ->
                LecturerSubjectFactory.buildLecturerSubject(null, subject, assignmentDate, contractType, roomNumber));
        assertEquals("Lecturer cannot be null.", exception1.getMessage());

        // Test with null subject
        Exception exception2 = assertThrows(IllegalArgumentException.class, () ->
                LecturerSubjectFactory.buildLecturerSubject(lecturer, null, assignmentDate, contractType, roomNumber));
        assertEquals("Subject cannot be null.", exception2.getMessage());

        // Test with null assignmentDate
        Exception exception3 = assertThrows(IllegalArgumentException.class, () ->
                LecturerSubjectFactory.buildLecturerSubject(lecturer, subject, null, contractType, roomNumber));
        assertEquals("Assignment date cannot be null.", exception3.getMessage());

        // Test with null contractType
        Exception exception4 = assertThrows(IllegalArgumentException.class, () ->
                LecturerSubjectFactory.buildLecturerSubject(lecturer, subject, assignmentDate, null, roomNumber));
        assertEquals("Contract type cannot be null or empty.", exception4.getMessage());

        // Test with null roomNumber
        Exception exception6 = assertThrows(IllegalArgumentException.class, () ->
                LecturerSubjectFactory.buildLecturerSubject(lecturer, subject, assignmentDate, contractType, null));
        assertEquals("Room number cannot be null or empty.", exception6.getMessage());
    }

    @Test
    void buildLecturerSubjectInvalidInput() {
        // Test with empty contractType
        Exception exception5 = assertThrows(IllegalArgumentException.class, () ->
                LecturerSubjectFactory.buildLecturerSubject(lecturer, subject, assignmentDate, "", roomNumber));
        assertEquals("Contract type cannot be null or empty.", exception5.getMessage());

        // Test with empty roomNumber
        Exception exception7 = assertThrows(IllegalArgumentException.class, () ->
                LecturerSubjectFactory.buildLecturerSubject(lecturer, subject, assignmentDate, contractType, ""));
        assertEquals("Room number cannot be null or empty.", exception7.getMessage());
    }

    @Test
    void buildLecturerSubject() {
        // Test with valid inputs
        LecturerSubject lecturerSubject = LecturerSubjectFactory.buildLecturerSubject(lecturer, subject, assignmentDate, contractType, roomNumber);
        assertNotNull(lecturerSubject);
        assertEquals(lecturer, lecturerSubject.getLecturer());
        assertEquals(subject, lecturerSubject.getSubject());
        assertEquals(assignmentDate, lecturerSubject.getAssignmentDate());
        assertEquals(contractType, lecturerSubject.getContractType());
        assertEquals(roomNumber, lecturerSubject.getRoomNumber());
    }
}