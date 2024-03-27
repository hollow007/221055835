package za.ac.cput.repository;

import za.ac.cput.domain.Student;

import java.util.ArrayList;
import java.util.List;



public class StudentRepository implements IStudentRepository{
private static IStudentRepository repository=null;
private List<Student> studentList;
private StudentRepository(){
    studentList=new ArrayList<>();
}
public static IStudentRepository getRepository(){
    if (repository==null){
        repository=new StudentRepository();

    }
    return repository;
}


    @Override
    public Student create(Student student) {
        boolean success=studentList.add(student);
        if(success){
            return student;
        }
        return null;
    }

    @Override
    public Student read(String studentNr) {
        for (Student student : studentList) {
            if (student.getStudentNumber().equals(studentNr)) {
                return student;
            }

        }
        return null;
}

    @Override
    public Student update(Student student) {
        String studentNumber=student.getStudentNumber();
        Student existingStudent=read(studentNumber);
        if(existingStudent!=null){
            if(delete(studentNumber)){
                boolean success=studentList.add(student);
                if(success){
                    return student;
                }
                else {
                    return null;
                }
            }
        }
return null;
    }

    @Override
    public boolean delete(String id) {

        Student studentToDelete=read(id);
        if(studentToDelete==null)
            return false;
        return (studentList.remove(studentToDelete));
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
}
