package za.ac.cput.repository;

import za.ac.cput.domain.LecturerSubject;

import java.util.List;

/* ILecturerSubjectRepository.java
   ILecturerSubjectRepository interface
   Author: Cavan Ramone Swartz (221055835)
   Date: 25 March 2024
   https://github.com/hollow007/mystudentregistrationapplication
 */
public interface ILecturerSubjectRepository {
    LecturerSubject create(LecturerSubject lecturerSubject);

    LecturerSubject read(String lecturerId, String subjectCode);

    LecturerSubject update(LecturerSubject lecturerSubject);

    boolean delete(String lecturerId, String subjectCode);

    List<LecturerSubject> getAll();
}
