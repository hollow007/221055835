package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.StudentSubject;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class StudentSubjectFactoryTest {
    StudentSubject stdSubj1;
    StudentSubject stdSubj2;
    StudentSubject stdSubj3;

    @BeforeEach
    void setUp(){
        stdSubj1 = StudentSubjectFactory.buildStudentSubject(StudentFactory.buildStudent("221307311","0108136253086","Mbasa","Cabane","Male","African", ContactFactory.buildContact("0743271204","221307311@mycput.ac.za","9 Solenya Street Mthatha 5100"))
                ,SubjectFactory.buildSubject("ADP3", "Appications Develpments Practice 3",
                "Application Development using Java programming language",
                "3 years", 30, 150),
                LocalDate.now());
        stdSubj2 = StudentSubjectFactory.buildStudentSubject(StudentFactory.buildStudent("219053324","0006205484089","Mpumzi","Mbula","Male","African", ContactFactory.buildContact("0658436358","219053324@mycput.ac.za","Ny 6 No 106 Gugulethu 7750"))
                ,SubjectFactory.buildSubject("ADP3", "Appications Develpments Practice 3",
                        "Application Development using Java programming language",
                        "3 years", 30, 150),
                LocalDate.now());
        stdSubj3 = stdSubj1;
    }
    @Test
    void buildStudentSubject(){
        stdSubj3 = stdSubj1;
        assertNotNull(stdSubj3);
        System.out.println(stdSubj3.toString());
    }
    @Test
    void testWithFail(){
        StudentSubject stdSubj4 = StudentSubjectFactory.buildStudentSubject(StudentFactory.buildStudent("221307311","0108136253086","Mbasa","Cabane","Male","African", ContactFactory.buildContact("0743271204","221307311@mycput.ac.za","9 Solenya Street Mthatha 5100")),
                SubjectFactory.buildSubject("ADP3", "Appications Develpments Practice 3",
                        "Application Development using Java programming language",
                        "3 years", 30, 150));
        assertNull(stdSubj4);
        System.out.println(stdSubj4.toString());
    }
    @Test
    void EqualityTest(){
        assertEquals(stdSubj1,stdSubj3);
    }
    @Test
    void testIdentity(){
        assertNotSame(stdSubj1, stdSubj2);
    }
    @Test
    @Disabled
    void testEquality(){
        stdSubj3 = stdSubj1;
        assertEquals(stdSubj1,stdSubj3);
    }
}
