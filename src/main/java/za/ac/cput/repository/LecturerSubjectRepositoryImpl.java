package za.ac.cput.repository;

import za.ac.cput.domain.LecturerSubject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* LecturerSubjectRepositoryImpl.java
   LecturerSubjectRepositoryImpl class
   Author: Cavan Ramone Swartz (221055835)
   Date: 25 March 2024
   https://github.com/hollow007/mystudentregistrationapplication
 */
public class LecturerSubjectRepositoryImpl implements LecturerSubjectRepository<LecturerSubject, String>{
    private static LecturerSubjectRepositoryImpl instance;
    private List<LecturerSubject> lecturerSubjects;

    private LecturerSubjectRepositoryImpl() {
        this.lecturerSubjects = new ArrayList<>();
    }

    public static LecturerSubjectRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new LecturerSubjectRepositoryImpl();
        }
        return instance;
    }

    @Override
    public LecturerSubject create(LecturerSubject lecturerSubject) {
        this.lecturerSubjects.add(lecturerSubject);
        return lecturerSubject;
    }

    @Override
    public LecturerSubject read(String id) {
        return this.lecturerSubjects.stream()
                .filter(ls -> Objects.equals(ls.getLecturer().getEmployeeId(), id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public LecturerSubject update(LecturerSubject lecturerSubject) {
        LecturerSubject lecturerSubjectToUpdate = read(String.valueOf(lecturerSubject.getLecturer().getEmployeeId()));
        if (lecturerSubjectToUpdate != null) {
            int index = this.lecturerSubjects.indexOf(lecturerSubjectToUpdate);
            this.lecturerSubjects.set(index, lecturerSubject);
        }
        return lecturerSubject;
    }

    @Override
    public boolean delete(String id) {
        LecturerSubject lecturerSubjectToDelete = read(id);
        if (lecturerSubjectToDelete != null) {
            this.lecturerSubjects.remove(lecturerSubjectToDelete);
            return true;
        }
        return false;
    }

    @Override
    public List<LecturerSubject> getAll() {
        return this.lecturerSubjects;
    }
}
