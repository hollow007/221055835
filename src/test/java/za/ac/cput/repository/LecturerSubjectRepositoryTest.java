package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.LecturerSubject;
import za.ac.cput.factory.LecturerSubjectFactory;
import za.ac.cput.factory.SubjectFactory;
import java.time.LocalDate;
import java.util.List;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

/* LecturerSubjectRepositoryTest.java
   LecturerSubjectRepositoryTest class
   Author: Cavan Ramone Swartz (221055835)
   Date: 26 March 2024
   https://github.com/hollow007/mystudentregistrationapplication
 */
class LecturerSubjectRepositoryTest {
    private static LecturerSubjectRepository repository;

    private static LecturerSubject lecturerSubject;

   /* @BeforeAll
    public static void setUp() {

        //repository = AppConfig.getLecturerSubjectRepository();

        lecturerSubject = LecturerSubjectFactory.buildLecturerSubject(
                LecturerFactory.buildLecturer("100001", "Prof", "Doe", "Male", 50000.00),
                SubjectFactory.buildSubject("CSE110", "Programming 101"),
                LocalDate.of(2023, 1, 1),
                "Full-time",
                "Room 101"
        );
    }*/

    @Test
    public void testCreate() {
        LecturerSubject created = repository.create(lecturerSubject);
        assertAll(
                () -> Assertions.assertNotNull(created),
                () -> Assertions.assertNotNull(created.getLecturer()),
                () -> Assertions.assertNotNull(created.getSubject()),
                () -> Assertions.assertNotNull(created.getAssignmentDate()),
                () -> Assertions.assertNotNull(created.getContractType()),
                () -> Assertions.assertNotNull(created.getRoomNumber())
        );
    }

    @Test
    public void testRead() {
        LecturerSubject retrieved = repository.read(String.valueOf(lecturerSubject.getLecturer().getEmployeeId()), lecturerSubject.getSubject().getSubjectCode());
        assertAll(
                () -> Assertions.assertNotNull(retrieved),
                () -> Assertions.assertNotNull(retrieved.getLecturer()),
                () -> Assertions.assertNotNull(retrieved.getSubject()),
                () -> Assertions.assertNotNull(retrieved.getAssignmentDate()),
                () -> Assertions.assertNotNull(retrieved.getContractType()),
                () -> Assertions.assertNotNull(retrieved.getRoomNumber())
        );
    }

    @Test
    public void testUpdate() {
        lecturerSubject.setContractType("Part-time");
        LecturerSubject updated = repository.update(lecturerSubject);
        assertAll(
                () -> Assertions.assertNotNull(updated),
                () -> Assertions.assertNotNull(updated.getLecturer()),
                () -> Assertions.assertNotNull(updated.getSubject()),
                () -> Assertions.assertNotNull(updated.getAssignmentDate()),
                () -> Assertions.assertNotNull(updated.getContractType()),
                () -> Assertions.assertNotNull(updated.getRoomNumber())
        );
    }

    @Test
    public void testGetAll() {
        List<LecturerSubject> allSubjects = repository.getAll();
        allSubjects.forEach(subject -> Assertions.assertNotNull(subject));
    }

    @Test
    public void testDelete() {
        boolean deleted = repository.delete(String.valueOf(lecturerSubject.getLecturer().getEmployeeId()), lecturerSubject.getSubject().getSubjectCode());
        assertAll(
                () -> Assertions.assertTrue(deleted),
                () -> Assertions.assertNull(repository.read(String.valueOf(lecturerSubject.getLecturer().getEmployeeId()), lecturerSubject.getSubject().getSubjectCode()))
        );
    }


}