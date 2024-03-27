package za.ac.cput.repository;
import za.ac.cput.domain.Contact;
import java.util.ArrayList;
import java.util.List;
//Siphosethu Makhambeni
//        221272976
//27/03/24
//IContactRepository.java
public interface IContactRepository extends IRepository<Contact,String> {
    List<Contact>getAll();
}
