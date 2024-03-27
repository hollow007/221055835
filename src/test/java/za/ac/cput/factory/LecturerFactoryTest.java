/*@author Joshua Mokwebo 222191562
  Day : 26 March 2024
  Time : 2:00PM
  GitHub Account :Fluffy-J Joshua@mycput
  GitHub repository :mystudentregistrationapplication


*/




package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Lecturer;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


class LecturerFactoryTest {



    @Test
    @Timeout(value = 20 , unit = TimeUnit.MILLISECONDS)
    void buildLecturer() {
        Contact c1 = ContactFactory.buildContact("067975722" , "farananijshua@gamil.com", "34BaterseaDrive");
        Lecturer l1 =  LecturerFactory.buildLecturer(1 , "Faranani" , "Mokwebo"  , "Male" , 300 , c1);
        assertEquals(l1 , l1);

    }


    @Disabled
    @Test
    void lecturer1isEqualtolecture2 () {


        Contact c1 = ContactFactory.buildContact("067975722" , "farananijshua@gamil.com", "34BaterseaDrive");
        Lecturer l1 =  LecturerFactory.buildLecturer(1 , "Faranani" , "Mokwebo"  , "Male" , 300 , c1);
        Lecturer l2 =  LecturerFactory.buildLecturer(1 , "Faranani" , "Mokwebo"  , "Male" , 300 , c1);
        assertEquals(l1 , l2);
        System.out.println(l1+" and "+l2+" are Equal ");
    }


    @Test

    void failTest () {

        Contact c1 = ContactFactory.buildContact("067975722" , "farananijshua@gamil.com", "34BaterseaDrive");
        Lecturer l1 =  LecturerFactory.buildLecturer(1 , "Faranani" , "Mokwebo"  , "Male" , 300 , c1);
        Lecturer l2 =  LecturerFactory.buildLecturer(1 , "Faranani" , "Mokwebo"  , "Male" , 300 , c1);
        assertEquals(l1 , l2);
        fail("l1 and l2 are not Equal");

    }


    @Test

    void isNotNullorVoid() {

        Contact c1 = ContactFactory.buildContact("067975722" , "farananijshua@gamil.com", "34BaterseaDrive");
        Lecturer l1 =  LecturerFactory.buildLecturer(1 , "Faranani" , "Mokwebo"  , "Male" , 300 , c1);
        assertNotNull(c1);


    }

    @Test
    void lecturer1isIdenticaltolecture2 () {


        Contact c = ContactFactory.buildContact("067975722" , "farananijshua@gamil.com", "34BaterseaDrive");
        Lecturer var1 =  LecturerFactory.buildLecturer(1 , "Faranani" , "Mokwebo"  , "Male" , 300 , c);
        Lecturer var2 ;
        var2 = var1;

        assertEquals(var1 , var2);
        System.out.println(" lecture 2 and lecture 1 are indentical ");

    }



}