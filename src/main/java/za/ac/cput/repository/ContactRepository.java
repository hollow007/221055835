package za.ac.cput.repository;
import za.ac.cput.domain.Contact;
import java.util.ArrayList;
import java.util.List;
//Siphosethu Makhambeni
//        221272976
//27/03/24
//ContactRepository.java
public class ContactRepository implements IContactRepository{
    private static IContactRepository  repository= null;
    private List<Contact> contactList;
    private ContactRepository(){
        contactList= new ArrayList<>();
    }

    public static IContactRepository getRepository() {
        if (repository == null){
            repository = new ContactRepository();
        }
        return repository;
    }
    @Override
    public Contact create(Contact contact){
        boolean created = contactList.add(contact);
        if (created){
            return contact;
        }
        return null;

    }
    @Override
    public Contact read(String contactNum){
       for(Contact contact : contactList){
           if (contact.getPhoneNumber().equals(contactNum)){
               return contact;
           }
       }
       return null;
    }
    @Override
    public Contact update(Contact contact){
        String contactNumber  = contact.getPhoneNumber();
        if(delete(contactNumber)){
            if (contactList.add(contact)){
                return contact;
            }
            else return null;
        }
        return null;
    }
    @Override
    public boolean delete(String con){
     Contact contactToDelete = read(con);
     if (contactToDelete==null)
         return false;
     return (contactList.remove(contactToDelete));
    }
    @Override
    public List<Contact>getAll(){
        return contactList;
    }

}
