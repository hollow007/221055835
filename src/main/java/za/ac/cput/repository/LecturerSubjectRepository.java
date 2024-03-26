package za.ac.cput.repository;

import za.ac.cput.domain.LecturerSubject;
import za.ac.cput.factory.LecturerSubjectFactory;
import za.ac.cput.util.LecturerSubjectHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* LecturerSubjectRepository.java
   LecturerSubjectRepository class
   Author: Cavan Ramone Swartz (221055835)
   Date: 25 March 2024
   https://github.com/hollow007/mystudentregistrationapplication
 */

public class LecturerSubjectRepository implements ILecturerSubjectRepository {
    private static LecturerSubjectRepository instance;
    private final List<LecturerSubject> lecturerSubjects = new ArrayList<>();

    private LecturerSubjectRepository() {}

    public static LecturerSubjectRepository getInstance() {
        if (instance == null) {
            instance = new LecturerSubjectRepository();
        }
        return instance;
    }

    @Override
    public LecturerSubject create(LecturerSubject lecturerSubject) {
        if (LecturerSubjectHelper.isLecturerSubjectNullOrEmpty(lecturerSubject)) {
            return null;
        }
        lecturerSubjects.add(lecturerSubject);
        return lecturerSubject;
    }

    @Override
    public LecturerSubject read(String lecturerId, String subjectCode) {
        for (LecturerSubject lecturerSubject : lecturerSubjects) {
            if (Objects.equals(lecturerSubject.getLecturer().getEmployeeId(), lecturerId) &&
                    lecturerSubject.getSubject().getSubjectCode().equals(subjectCode)) {
                return lecturerSubject;
            }
        }
        return null;
    }

    @Override
    public LecturerSubject update(LecturerSubject lecturerSubject) {
        if (LecturerSubjectHelper.isLecturerSubjectNullOrEmpty(lecturerSubject)) {
            return null;
        }
        for (int i = 0; i < lecturerSubjects.size(); i++) {
            if (Objects.equals(lecturerSubjects.get(i).getLecturer().getEmployeeId(), lecturerSubject.getLecturer().getEmployeeId()) &&
                    lecturerSubjects.get(i).getSubject().getSubjectCode().equals(lecturerSubject.getSubject().getSubjectCode())) {
                lecturerSubjects.set(i, lecturerSubject);
                return lecturerSubject;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String lecturerId, String subjectCode) {
        for (int i = 0; i < lecturerSubjects.size(); i++) {
            if (Objects.equals(lecturerSubjects.get(i).getLecturer().getEmployeeId(), lecturerId) &&
                    lecturerSubjects.get(i).getSubject().getSubjectCode().equals(subjectCode)) {
                lecturerSubjects.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<LecturerSubject> getAll() {
        return lecturerSubjects;
    }
}
