package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.StudentSubject;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.factory.StudentSubjectFactory;
import za.ac.cput.factory.SubjectFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentSubjectRepositoryTest {
    private StudentSubjectRepository stdSubjRepository;
    private StudentSubject stdSubjRepository1;
    private StudentSubject stdSubjRepository2;

    @BeforeEach
    void setUp() {
        stdSubjRepository= (StudentSubjectRepository) StudentSubjectRepository.getRepository();
        stdSubjRepository1 = StudentSubjectFactory.buildStudentSubject(StudentFactory.buildStudent("219053324","0006205484089",
                        "Mpumzi","Mbula","Male","African", ContactFactory.buildContact("0658436358",
                                "219053324@mycput.ac.za","Ny 6 No 106 Gugulethu 7750")),
                SubjectFactory.buildSubject("ADP3", "Appications Develpments Practice 3",
                        "Application Development using Java programming language",
                        "3 years", 30, 150));

        stdSubjRepository2 = StudentSubjectFactory.buildStudentSubject(StudentFactory.buildStudent("221307311","0108136253086",
                        "Mbasa","Cabane","Male","African", ContactFactory.buildContact("0743271204",
                                "221307311@mycput.ac.za","9 Solenya Street Nthatha 5100")),
                SubjectFactory.buildSubject("ADP3", "Appications Develpments Practice 3",
                        "Application Development using Java programming language",
                        "3 years", 30, 150));
    }
    @Test
    void create() {
        StudentSubject createdStdSubj = stdSubjRepository.create(stdSubjRepository1);
        assertEquals(createdStdSubj, stdSubjRepository1);
        System.out.println(createdStdSubj);
    }
    @Test
    void read() {
        stdSubjRepository.create(stdSubjRepository2);
        Student searchedStudent = stdSubjRepository2.getStudent();
        StudentSubject stdSubjFound = stdSubjRepository.read(searchedStudent);

        assertEquals(stdSubjRepository2, stdSubjFound);
        System.out.println(stdSubjFound);

    }
    @Test
    void update() {
        StudentSubject newStudentSubject=StudentSubjectFactory.buildStudentSubject(StudentFactory.buildStudent("219053324","0006205484089",
                        "Mpumzi","Zakade","Male","African", ContactFactory.buildContact(
                                "0658436358","219053324@mycput.ac.za","Ny 6 No 106 Gugulethu 7750")),
                SubjectFactory.buildSubject("ITS3", "Information Systems 3"));
        StudentSubject studentSubjInRepository=stdSubjRepository.update(newStudentSubject);
        assertNotEquals(newStudentSubject,studentSubjInRepository);
        System.out.println(studentSubjInRepository);
        System.out.println(newStudentSubject);
    }

    @Test
    void delete() {
        stdSubjRepository.create(stdSubjRepository1);
        boolean isDeleted = stdSubjRepository.delete(stdSubjRepository1.getStudent());

        assertTrue(isDeleted);

    }
    @Test
    void getAll() {
        stdSubjRepository.create(stdSubjRepository1);
        stdSubjRepository.create(stdSubjRepository2);



        List<StudentSubject> addedStudentSubjects = stdSubjRepository.getAll();

        assertEquals(2,addedStudentSubjects.size());


    }
}
