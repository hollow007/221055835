/*@author Joshua Mokwebo 222191562
  Day : 24 March 2024
  Time : 7:42PM
  GitHub Account :Fluffy-J Joshua@mycput

*/

package za.ac.cput.factory;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Lecturer;
import za.ac.cput.util.LecturerHelper;

public class LecturerFactory {

    public static Lecturer buildLecturer(int employeeId , String firstName , String lastName ,
                                         String gender , double salary , Contact contact){

        if(LecturerHelper.isInVdvalid(employeeId) || LecturerHelper.isContactNullorEmpty(contact)){
            return null ;
        }


        employeeId = LecturerHelper.generateId();

        return new Lecturer.Builder().setEmployeeId(employeeId).setFirstName(firstName).setLastName(lastName)
                .setGender(gender).setSalary(salary).build();





    }
}
