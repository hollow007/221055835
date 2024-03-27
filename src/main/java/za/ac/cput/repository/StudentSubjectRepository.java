package za.ac.cput.repository;

import za.ac.cput.domain.Student;
import za.ac.cput.domain.StudentSubject;

import java.util.ArrayList;
import java.util.List;

public class StudentSubjectRepository implements IStudentSubjectRepository{
    private static IStudentSubjectRepository repository=null;
    private List<StudentSubject> stdsubjList;
    StudentSubjectRepository(){
        stdsubjList=new ArrayList<StudentSubject>();
    }

    public static IStudentSubjectRepository getRepository(){
        if (repository==null){
            repository=new StudentSubjectRepository();

        }
        return repository;
    }
    @Override
    public StudentSubject create(StudentSubject studentSubject) {
        boolean success=stdsubjList.add(studentSubject);
        if(success){
            return studentSubject;
        }
        return null;
    }

    @Override
    public StudentSubject read(Object obj) {
        for (StudentSubject stdsubj : stdsubjList) {
            if (stdsubj.getStudent().equals(obj)) {
                return stdsubj;
            }

        }
        return null;
    }

    @Override
    public StudentSubject update(StudentSubject studentSubject) {
        Student student = studentSubject.getStudent();
        StudentSubject existingStudentSubject = read(student);
        if (existingStudentSubject != null) {
            if (delete(student)) {
                boolean success = stdsubjList.add(studentSubject);
                if (success) {
                    return studentSubject;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public boolean delete(Object obj) {
        StudentSubject stdsubjToDelete=read(obj);
        if(stdsubjToDelete==null)
            return false;
        return (stdsubjList.remove(stdsubjToDelete));
    }

    @Override
    public List<StudentSubject> getAll() {
        return stdsubjList;
    }
}
