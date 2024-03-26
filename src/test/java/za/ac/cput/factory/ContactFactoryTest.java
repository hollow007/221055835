package za.ac.cput.factory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Contact;
import static org.junit.jupiter.api.Assertions.*;

//Siphosethu Makhambeni
//        221272976
//25/03/2024
//ContactFactory
public class ContactFactoryTest {
 Contact contact;
 Contact contact2;
 Contact contact3;
 Contact contact4;

 @BeforeEach
 void setup(){
  contact = ContactFactory.buildContact("0729872231","221262170@mycput.ac.za","143 Sir Lowery, Woodstock, 8001");
  contact2 = ContactFactory.buildContact("0782456678","221287612@mycput.ac.za","16 bree Cape Town 8001");
  contact3 = contact;
  contact4 = contact3;
 }
 @Test
 void checkIfContactNotNull(){
  assertNotNull(contact);
  System.out.println(contact.toString());
 }
 @Test
 void testBuildStudentWithFail(){
  assertNotNull(contact2);
  System.out.println(contact2);
 }
 @Test
 void checkIfNull(){
  assertNull(contact2);
  System.out.println(contact2);
 }
 @Test
 void equalityTest(){
  assertEquals(contact,contact4);
  System.out.println(contact4);
 }
}
