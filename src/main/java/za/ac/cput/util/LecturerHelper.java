/*@author Joshua Mokwebo 222191562
  Day : 24 March 2024
  Time : 7:42PM
  GitHub Account :Fluffy-J Joshua@mycput

*/
package za.ac.cput.util;


import za.ac.cput.domain.Contact;

import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class LecturerHelper {

    // used to validate
    public  static boolean isContactNullorEmpty(Contact c) {
        if( c == null)
            return true;
        return false ;

    }

    public static boolean isInVdvalid(int id){
        if(id <= 0)
            return true;
        return false;

    }

    public static int generateId(){
        String sId = UUID.randomUUID().toString();
        int iId = sId.hashCode();
        return iId ;

    }


}

