package za.ac.cput.repository;


import java.util.List;

/* LecturerSubjectRepository.java
   LecturerSubjectRepository class
   Author: Cavan Ramone Swartz (221055835)
   Date: 25 March 2024
   https://github.com/hollow007/mystudentregistrationapplication
 */
public interface LecturerSubjectRepository<T, ID> {
    T create(T lecturerSubject);
    T read(ID id);
    T update(T lecturerSubject);
    boolean delete(ID id);
    List<T> getAll();
}
