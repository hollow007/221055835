package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Subject;

import static org.junit.jupiter.api.Assertions.*;

//Mlungisi L. Mbuyazi
// 221164014
// https://github.com/Skiet88/studentregistrationapplication
class SubjectFactoryTest {


    String subjectCode;
    String subjectName;
    String description;
    String duration;
    int credits;
    int enrollmentCapacity;

    Subject subject1;
    Subject subject2;
    String subjectCode2;
    String subjectName2;

    @BeforeEach
    void startUp() {
        subjectCode = "ITS3";
        subjectName = "Information Systems";
        description = "Introduction to database and System Modelling";
        duration = "1 Year";
        credits = 16;
        enrollmentCapacity = 50;

        subject1 = SubjectFactory.buildSubject(subjectCode, subjectName, description, duration,
                credits, enrollmentCapacity);

        subjectCode2 = "ADP3";
        subjectName2 = "Appications Develpments Practice 3";

        subject2 = SubjectFactory.buildSubject(subjectCode2, subjectName2);

    }

    @Test
    void buildSubject() {


        assertNotNull(subject1);
        assertEquals(subjectCode, subject1.getSubjectCode());
        assertEquals(subjectName, subject1.getSubjectName());
        assertEquals(description, subject1.getDescription());
        assertEquals(duration, subject1.getDuration());
        assertEquals(credits, subject1.getCourseCredits());
        assertEquals(enrollmentCapacity, subject1.getEnrollmentCapacity());

    }

    @Test
    void buildSubject_MustNot_Have_NullValues() {
        duration = null;

        subject1 = SubjectFactory.buildSubject(subjectCode, subjectName, description, duration,
                credits, enrollmentCapacity);

        assertNull(subject1);

    }


    @Test
    void testBuildSubject_WithMandatory_Attribes() {


        assertNotNull(subject2);
        assertEquals(subjectCode2, subject2.getSubjectCode());
        assertEquals(subjectName2, subject2.getSubjectName());
        assertNull(subject2.getDescription());
        assertNull(subject2.getDuration());
        assertEquals(0, subject2.getCourseCredits());
        assertEquals(0, subject2.getEnrollmentCapacity());

    }

    @Test
    void buildSubject_withEmptyParameters_shouldReturnNull() {

        Subject subject = SubjectFactory.buildSubject("", "", "", "", 0, 0);
        assertNull(subject);
    }

    @Test
    void subjects_withDifferentParameters_shouldNotReturnSameObject() {
        assertNotSame(subject1, subject2);
    }

}