package za.ac.cput.repository;

import za.ac.cput.domain.Student;
import za.ac.cput.domain.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository implements ISubjectRepository {
    private static ISubjectRepository repository = null;
    private List<Subject> subjectList;

    public SubjectRepository() {
        subjectList = new ArrayList<Subject>();
    }

    public static ISubjectRepository getRepository() {
        if (repository == null) {
            repository = new SubjectRepository();
        }
        return repository;
    }


    @Override
    public Subject create(Subject subject) {
        boolean isCreated = subjectList.add(subject);
        if (isCreated) {
            return subject;
        }
        return null;
    }

    @Override
    public Subject read(String s) {
        for (Subject e : subjectList) {
            if (e.getSubjectCode().equals(s)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public Subject update(Subject subject) {
        String subjectCode = subject.getSubjectCode();
        if (delete(subjectCode)) {
            if (subjectList.add(subject))
                return subject;
            else
                return null;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Subject deletedSubject = read(s);

        if (deletedSubject == null) {
            return false;
        }
        return subjectList.remove(deletedSubject);
    }

    @Override
    public List<Subject> getAll() {
        return subjectList;
    }
}
