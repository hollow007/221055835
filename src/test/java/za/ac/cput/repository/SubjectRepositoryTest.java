package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Subject;
import za.ac.cput.factory.SubjectFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
// Mlungisi L. Mbuyazi
// 221164014
// https://github.com/Skiet88/studentregistrationapplication
class SubjectRepositoryTest {
    private SubjectRepository subjectRepository;
    private Subject subject1;
    private Subject subject2;
    private Subject subject3;

    @BeforeEach
    void setUp() {
        subjectRepository = new SubjectRepository();
        subject1 = SubjectFactory.buildSubject("ADP2", "Application Development Practice 2");
        subject2 = SubjectFactory.buildSubject("ADP3", "Application Development Practice 3");

        subject3 = SubjectFactory.buildSubject("ITS3", "Information Systems 3");

    }


    @Test
    void create() {
        Subject createdSubject = subjectRepository.create(subject1);
        assertEquals(createdSubject, subject1);
    }

    @Test
    void read() {
        subjectRepository.create(subject1);
        String searchedID = subject1.getSubjectCode();
        Subject subjectFound = subjectRepository.read(searchedID);

        assertEquals(subject1, subjectFound);

    }

//    @Test
//    void update() {
//        subjectRepository.create(subject1);
//        Subject newSubject = SubjectFactory.buildSubject(subject1.getSubjectCode(), "Applications Dev 2");
//
//       Subject updatedSubject = subjectRepository.update(newSubject);
//        assertEquals(, );
//
////        subjectRepository.create(subject1);
////        subject1 = subject2;
////        Subject updatedSubject = subjectRepository.update(subject1);
////        assertEquals(subject1, subject2);
//
//    }

    @Test
    void delete() {
            subjectRepository.create(subject1);
            boolean isDeleted = subjectRepository.delete(subject1.getSubjectCode());

            assertTrue(isDeleted);

    }

    @Test
    void getAll() {
        subjectRepository.create(subject1);
        subjectRepository.create(subject2);
        subjectRepository.create(subject3);

        List<Subject> addedSubjects = subjectRepository.getAll();

        assertEquals(3,addedSubjects.size());


    }
}