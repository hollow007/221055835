/*@author Joshua Mokwebo 222191562
  Day : 27 March 2024
  Time : 2:00PM
  GitHub Account :Fluffy-J Joshua@mycput
  GitHub repository :mystudentregistrationapplication

*/



package za.ac.cput.repository;
import za.ac.cput.domain.Lecturer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LecturerRepository  implements ILecturerRepository {

    private static IRepository repository = null;
    private List <Lecturer> lecturerList;

    private LecturerRepository(){
        lecturerList = new ArrayList<Lecturer>();
    }


    public static ILecturerRepository getRepository(){
        if(repository == null){
            repository = new LecturerRepository();
        }
        return (ILecturerRepository) repository ;
    }


    @Override
    public Lecturer create(Lecturer lecturer) {
        boolean success = lecturerList.add(lecturer);
        if(success)
            return lecturer;
        else

            return null;
    }

    @Override
    public Lecturer read(String id) {

        for (Lecturer e : lecturerList) {

            if (String.valueOf(e.getEmployeeId()).equals(id))
                return e;


        }
        return null;
    }

    @Override
    public Lecturer update(Lecturer lecturer) {
        String employeeNumber  = String.valueOf(lecturer.getEmployeeId());
        if (delete(employeeNumber)){
            if(lecturerList.add(lecturer))
                return lecturer;
            else
                return null ;

        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Lecturer lecturerToDelete = read(id);
        if(lecturerToDelete == null)
            return false ;

        return(lecturerList.remove(lecturerToDelete));
    }

    @Override
    public List<Lecturer> getall() {
        return lecturerList;
    }
}
