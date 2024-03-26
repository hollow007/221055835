package za.ac.cput.factory;
import za.ac.cput.domain.Contact;
import za.ac.cput.util.ContactHelper;
//Siphosethu Makhambeni
//        221272976
//25/03/2024
//ContactFactory
public class ContactFactory {
    public static Contact buildContact(String phoneNumber, String emailAddress, String address) {

        if(ContactHelper.isNullOrEmpty(phoneNumber)||ContactHelper.isNullOrEmpty(emailAddress)||ContactHelper.isNullOrEmpty(address)){
            return null;
        }


        return new Contact.ContactBuilder()
                .setPhoneNumber(phoneNumber)
                .setEmailAddress(emailAddress)
                .setAddress(address)
                .build();
    }



}
