package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Lecturer;
import za.ac.cput.domain.LecturerSubject;
import za.ac.cput.domain.Subject;
import za.ac.cput.factory.LecturerSubjectFactory;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.factory.LecturerFactory;
import za.ac.cput.factory.SubjectFactory;
import za.ac.cput.factory.LecturerSubjectFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
/* LecturerSubjectRepository.java
   LecturerSubjectRepository class
   Author: Cavan Ramone Swartz (221055835)
   Date: 26 March 2024
   https://github.com/hollow007/mystudentregistrationapplication
 */
@Nested
class LecturerSubjectRepositoryTest {

    private LecturerSubjectRepository<LecturerSubject, String> lecturerSubjectRepository;
    private LecturerSubject lecturerSubject;
    private String id;
   // private LecturerSubjectRepository<LecturerSubject, String> lecturerSubjectRepository;

    @BeforeEach
    void setUp() {
        this.lecturerSubjectRepository = LecturerSubjectRepositoryImpl.getInstance();
        // Create a Lecturer
        Lecturer lecturer = LecturerFactory.createLecturer("1", "John", "Doe", "Male", 50000);

        // Create a Subject
        Subject subject = SubjectFactory.createSubject("1", "Java", "Java Programming", 5, 10, 3);

        // Create a LecturerSubject instance
        this.lecturerSubject = LecturerSubjectFactory.buildLecturerSubject(lecturer, subject, LocalDate.of(2023, 9, 15), "Permanent", "Room 101");

        // Generate an ID for the lecturerSubject
        this.id = String.valueOf(this.lecturerSubject.getLecturer().getEmployeeId());

        // Save the lecturerSubject for testing
        this.lecturerSubjectRepository.create(lecturerSubject);
    }

    @Test
    void create() {
        // Create a LecturerSubject instance
        LecturerSubject lecturerSubject = LecturerSubjectFactory.buildLecturerSubject(
                LecturerSubjectFactory.createLecturer("1", "John", "Doe", "Male", 50000),
                SubjectFactory.buildSubject("1", "Java", "Java Programming", 5, 10, 3),
                LocalDate.of(2023, 9, 15),
                "Permanent",
                "Room 101"
        );

        // Invoke the create method
        LecturerSubject createdLecturerSubject = this.lecturerSubjectRepository.create(lecturerSubject);

        // Check if the LecturerSubject is added to the repository
        assertNotNull(createdLecturerSubject);
        assertEquals(lecturerSubject, createdLecturerSubject);
    }
    }

@Test
void read() {
    // Invoke the read method
    LecturerSubject readLecturerSubject = this.lecturerSubjectRepository.read(id);

    // Check if the readLecturerSubject is not null
    assertNotNull(readLecturerSubject);

    // Check if the readLecturerSubject is the same as the created one
    Object lecturerSubject = new Object();
    assertEquals(lecturerSubject, readLecturerSubject);
}

@Test
void update() {
    // Update the lecturerSubject properties
    String newRoomNumber = "Room 102";
    lecturerSubject.setRoomNumber(newRoomNumber);

    // Invoke the update method
    LecturerSubject updatedLecturerSubject = this.lecturerSubjectRepository.update(lecturerSubject);

    // Check if the updatedLecturerSubject is not null
    assertNotNull(updatedLecturerSubject);

    // Check if the updatedLecturerSubject is the same as the updated one
    assertEquals(lecturerSubject, updatedLecturerSubject);

    // Check if the room number is updated
    assertEquals(newRoomNumber, updatedLecturerSubject.getRoomNumber());
}

@Test
void delete() {
    // Invoke the delete method
    boolean isDeleted = this.lecturerSubjectRepository.delete(id);

    // Check if the lecturerSubject is deleted
    assertTrue(isDeleted);

    // Check if the lecturerSubject is not in the repository
    assertNull(this.lecturerSubjectRepository.read(id));
}

@Test
void getAll() {
    // Create another LecturerSubject instance
    Lecturer lecturer2 = LecturerFactory.createLecturer("2", "Jane", "Doe", "Female", 60000);
    Subject subject2 = SubjectFactory.createSubject("2", "Python", "Python Programming", 5, 10, 3);
    LecturerSubject lecturerSubject2 = LecturerSubjectFactory.buildLecturerSubject(lecturer2, subject2, LocalDate.of(2023, 9, 16), "Contract", "Room 102");

    // Add the second lecturerSubject to the repository
    this.lecturerSubjectRepository.create(lecturerSubject2);

    // Check if the repository has two lecturerSubjects
    assertEquals(2, this.lecturerSubjectRepository.getAll().size());

    // Check if the lecturerSubjects are in the repository
    assertTrue(this.lecturerSubjectRepository.getAll().contains(lecturerSubject));
    assertTrue(this.lecturerSubjectRepository.getAll().contains(lecturerSubject2));
}

@AfterEach
void tearDown() {
    // Clear the repository
    this.lecturerSubjectRepository.getAll().clear();
}
}