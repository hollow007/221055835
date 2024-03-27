package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Lecturer;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.LecturerFactory;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LecturerRepositoryTest {
    LecturerRepository repository1 = null ;

    @Test
    void  isRepositoryCreated(){

        assertNull(repository1);
    }

    @Test
    void isRepositoryEmpty(){
        assertNull(repository1);
    }




}