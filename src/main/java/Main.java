/*@author Joshua Mokwebo 222191562
  Day : 27 March 2024
  Time : 2:00PM
  GitHub Account :Fluffy-J Joshua@mycput
  GitHub repository :mystudentregistrationapplication

*/
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Lecturer;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.LecturerFactory;
import za.ac.cput.repository.LecturerRepository;
import za.ac.cput.util.LecturerHelper;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Contact c1 = ContactFactory.buildContact("067975722" , "farananijshua@gamil.com", "34BaterseaDrive");

        Lecturer l1 = new Lecturer.Builder().setEmployeeId(LecturerHelper.generateId()).setFirstName("Mokwebo").setLastName("Joshua").setContact(c1).build();
        String employeeId = String.valueOf(l1.getEmployeeId());
        //System.out.println(l1.toString());

        LecturerRepository repository = null;
        repository = (LecturerRepository) repository.getRepository();
        ArrayList<Lecturer>lectureList = new ArrayList<>();

        repository.create(l1);
        repository.read(employeeId);
        lectureList = (ArrayList<Lecturer>)repository.getall();
        System.out.println(lectureList.toString());

        repository.delete(employeeId);
        System.out.println(lectureList.toString());

        repository.update(l1);
        System.out.println(lectureList.toString());








    }
}
