package za.ac.cput.util;

import za.ac.cput.domain.Contact;

public class StudentHelper {
    public static boolean isNullOrEmpty(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isContactNullOrEmpty(Contact contact) {
        if (contact == null) {
            return true;
        }
        if (isNullOrEmpty(contact.getPhoneNumber()) ||
                isNullOrEmpty(contact.getAddress()) || isNullOrEmpty(contact.getEmailAddress()
        )) {
            return true;
        }

       return false;

   }
}
