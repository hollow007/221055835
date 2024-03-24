package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Subject;

import static org.junit.jupiter.api.Assertions.*;

class SubjectFactoryTest {


    String subjectCode;
    String subjectName;
    String description;
    String duration;
    int credits;
    int enrollmentCapacity;

    Subject subject;
    @Test
    void buildSubject() {
        subjectCode = "MAT101";
        subjectName = "Mathematics";
        description = "Introduction to Mathematics";
        duration = "1 semester";
        credits = 4;
        enrollmentCapacity = 50;

        subject = SubjectFactory.buildSubject(subjectCode, subjectName,description, duration,
                credits, enrollmentCapacity) ;

        assertNotNull(subject);
        assertEquals(subjectCode, subject.getSubjectCode());
        assertEquals(subjectName, subject.getSubjectName());
        assertEquals(description, subject.getDescription());
        assertEquals(duration, subject.getDuration());
        assertEquals(credits, subject.getSubjectCredits());
        assertEquals(enrollmentCapacity, subject.getEnrollmentCapacity());



    }
    @Test
    void buildSubject_MustNot_Have_NullValues() {
        subjectCode = "MAT101";
        subjectName = "Mathematics";
        description = "Introduction to Mathematics";

        credits = 4;
        enrollmentCapacity = 50;

        subject = SubjectFactory.buildSubject(subjectCode, subjectName,description, duration,
                credits, enrollmentCapacity) ;

        assertNull(subject);

    }


    @Test
    void testBuildSubject_WithMandatory_Attribes() {

        subjectCode = "ADP3";
        subjectName = "Appications Develpments Practice 3";


        subject = SubjectFactory.buildSubject(subjectCode, subjectName);

        assertNotNull(subject);
        assertEquals(subjectCode, subject.getSubjectCode());
        assertEquals(subjectName, subject.getSubjectName());
        assertNull(subject.getDescription());
        assertNull(subject.getDuration());
        assertEquals(0, subject.getSubjectCredits());
        assertEquals(0, subject.getEnrollmentCapacity());

    }

    @Test
    void buildSubject_withEmptyParameters_shouldReturnNull() {

        Subject subject = SubjectFactory.buildSubject("", "", "", "", 0, 0);
        assertNotNull(subject);
    }

    @Test
    void subjects_withDifferentParameters_shouldNotReturnSameObject() {

        subjectCode = "MAT101";
        subjectName = "Mathematics";
        description = "Introduction to Mathematics";
        duration = "1 semester";
        credits = 4;
        enrollmentCapacity = 50;

        Subject subject1 = SubjectFactory.buildSubject(subjectCode, subjectName,description, duration,
                credits, enrollmentCapacity) ;

        String subjectCode2 = "ADP3";
        String subjectName2 = "Appications Develpments Practice 3";

        Subject subject2 = SubjectFactory.buildSubject(subjectCode2, subjectName2);

        assertNotSame(subject1, subject2);
    }



}