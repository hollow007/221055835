package za.ac.cput.repository;
// Mlungisi L. Mbuyazi
// 221164014
// https://github.com/Skiet88/studentregistrationapplication
import za.ac.cput.domain.Subject;

import java.util.List;

public interface ISubjectRepository extends  IRepository<Subject, String>{
    List<Subject> getAll();
}