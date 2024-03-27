package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Contact;
import za.ac.cput.factory.ContactFactory;
import static org.junit.jupiter.api.Assertions.*;
 class ContactRepositoryTest {
private ContactRepository contactRepository;

@BeforeEach
     void setUp(){
    contactRepository = (ContactRepository)ContactRepository.getRepository();
    contactRepository.create(ContactFactory.buildContact("0728976652","221876522@mycput.ac.za","320 Brown Street Woodstock 8001"));
    contactRepository.create(ContactFactory.buildContact("0650124349","218945991@mycput.ac.za","197 voortrekker road parow 7560"));
}
@Test
     void create(){
    Contact contact = ContactFactory.buildContact("0714146558","221272976@mycput.ac.za","143 Sir Lowery WoodStock 8001");
    Contact createdContact = contactRepository.create(contact);
    assertEquals(contact,createdContact);
    System.out.println(createdContact);
}

@Test
     void read(){
    Contact searchedContact = contactRepository.read("0714146558");
    assertNotNull(searchedContact);
    assertEquals("221272976@mycput.ac.za",searchedContact.getEmailAddress());
    System.out.println(searchedContact);
}
@Test
     void update(){
    Contact updatedContact = ContactFactory.buildContact("0731966188","212034876@mycput.ac.za","143 Sir Lowery Woodstock 8001");
    Contact updatedContactInRepository = contactRepository.update(updatedContact);
    assertEquals(updatedContact,updatedContactInRepository);
    assertNotNull(updatedContactInRepository);
    System.out.println(updatedContactInRepository);
}
@Test
     void delete(){
    boolean deleteAttempt = contactRepository.delete("0731966188");
    assertTrue(deleteAttempt);
    assertNotNull(deleteAttempt);
}
@Test
     void getAll(){
    assertEquals(2,contactRepository.getAll().size());
    assertNotNull(contactRepository.getAll());
    System.out.println(contactRepository.getAll().size());
}

}
