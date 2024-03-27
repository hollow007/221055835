package za.ac.cput.repository;

import za.ac.cput.domain.StudentSubject;

import java.util.List;

public interface IStudentSubjectRepository extends IRepository<StudentSubject, Object> {
    List<StudentSubject> getAll();
}