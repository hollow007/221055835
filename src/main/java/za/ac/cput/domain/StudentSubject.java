package za.ac.cput.domain;

import java.time.LocalDate;

public class StudentSubject {
    private Student student;
    private Subject subject;
    private LocalDate enrollmentDate;

    private StudentSubject(){}


private StudentSubject(StudentSubjectBuilder builder){
        this.student = builder.student;
        this.subject = builder.subject;
        this.enrollmentDate = builder.enrollmentDate;

}
public Student getStudent(){
    return student;
}
public Subject getSubject(){
        return subject;
}
public LocalDate getEnrollmentDate(){
        return enrollmentDate;
}

    @Override
    public String toString() {
        return "StudentSubject{" +
                "\n" + student +
                "\n" + subject +
                "\nenrollmentDate=" + enrollmentDate +
                '}';
    }

    public static class StudentSubjectBuilder{
        private Student student;
        private Subject subject;
        private LocalDate enrollmentDate;

        public StudentSubjectBuilder setStudent(Student student){
            this.student = student;
            return this;
        }
        public StudentSubjectBuilder setSubject(Subject subject){
            this.subject = subject;
            return this;
        }
        public StudentSubjectBuilder setEnrollmentDate(LocalDate enrollmentDate){
            this.enrollmentDate = enrollmentDate;
            return this;
        }
        public StudentSubject buildStudentSubject(){
            return new StudentSubject((this));
        }
}

}
