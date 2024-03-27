package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {
private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        studentRepository= (StudentRepository) StudentRepository.getRepository();
        studentRepository.create(StudentFactory.buildStudent("219053324","0006205484089","Mpumzi","Mbula","Male","African", ContactFactory.buildContact("0658436358","219053324@mycput.ac.za","Ny 6 No 106 Gugulethu 7750")));
        studentRepository.create(StudentFactory.buildStudent("123456789","0306255484089","Nombulelo","James","Female","Colored", ContactFactory.buildContact("0689076358","225053328@mycput.ac.za","3 Jacaranda Woodstock 8001")));
    }

    @Test
    void create() {
        Student student=StudentFactory.buildStudent("987654321","7806065494081","Nyameka","Mbuyazi","Female","African", ContactFactory.buildContact("0785111818","216975252@mycput.ac.za","67 Jan Smarts Brackenfell 8790"));
        Student createdStudent=studentRepository.create(student);
        assertEquals(student,createdStudent);
        System.out.println(createdStudent);
    }

    @Test
    void read() {
        Student searchedStudent =studentRepository.read("219053324");
        assertNotNull(searchedStudent);
        assertEquals("Mpumzi",searchedStudent.getFirstName());
        System.out.println(searchedStudent);
    }

    @Test
    void update() {
        Student updatedStudent=StudentFactory.buildStudent("219053324","0006205484089","Mpumzi","Zakade","Male","African", ContactFactory.buildContact("0658436358","219053324@mycput.ac.za","Ny 6 No 106 Gugulethu 7750"));
        Student updatedStudentInRepository=studentRepository.update(updatedStudent);
        assertEquals(updatedStudent,updatedStudentInRepository);
        assertNotNull(updatedStudentInRepository);
        System.out.println(updatedStudentInRepository);
    }

    @Test
    void delete() {
        boolean deleteAttempt=studentRepository.delete("123456789");
        assertTrue(deleteAttempt);
        assertNotNull(deleteAttempt);
    }
    @Test
    void getAll(){
        assertEquals(2,studentRepository.getAll().size());
        assertNotNull(studentRepository.getAll());
        System.out.println(studentRepository.getAll().size());

    }
}