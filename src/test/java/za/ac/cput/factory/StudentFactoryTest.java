package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Student;
/**
 * Mpumzi Mbula
 * 219053324
 * 24/03/2024
 * StudentFactoryTest.java
 *
 */
import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {
    Student student;
    Student student2;
    Student student3;
    Student student4;

    @BeforeEach
    void setup(){
        student=StudentFactory.buildStudent("219053324","0006205484089","Mpumzi","Mbula","Male","African", ContactFactory.buildContact("0658436358","219053324@mycput.ac.za","Ny 6 No 106 Gugulethu 7750"));
        student2=StudentFactory.buildStudent("","0306255484089","Nombulelo","James","Female","Colored", ContactFactory.buildContact("0659076358","225053328@mycput.ac.za","3 Jacaranda Woodstock 8001"));
        student3=student;
        student4=student3;
    }
    @Test
    void buildEmployee(){
        assertNotNull(student);
        System.out.println(student.toString());
    }
    @Test
    void testBuildStudentWithFail(){

        assertNotNull(student2);
        System.out.println(student2);

    }
    @Test
    void checkIfNull(){
        assertNull(student2);
        System.out.println(student2);
    }
    @Test
    void equalityTest() {
        assertEquals(student,student4);
        System.out.println(student4);
    }

}