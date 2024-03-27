import za.ac.cput.domain.*;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.factory.SubjectFactory;

public class Main {
    public static void main(String[] args) {
//        Student student=new Student.StudentBuilder().setStudentNumber("219053324").
//                setIdNumber("0006205484089").
//                setFirstName("Mpumzi").
//                setLastName("Mbula").
//                setGender("Male").
//                setEthnicity("African").
//                setContact(new Contact.ContactBuilder().setPhoneNumber("0658436358").
//                        setEmailAddress("219053324@mycput.ac.za").
//                        setAddress("Ny 6 No 106 Gugulethu 7750").
//                        build()).
//                build()
        //;


//       System.out.println(student);
        System.out.println("---------------------------------------------");
//        Student student=StudentFactory.buildStudent("219053324","0006205484089","Mpumzi","Mbula","Male","African", ContactFactory.buildContact("0658436358","219053324@mycput.ac.za","Ny 6 No 106 Gugulethu 7750"));
//        System.out.println(student);
//        System.out.println("---------------------------------------------");
//        LecturerSubject lecturerSubject = new LecturerSubject.LecturerSubjectBuilder().setContractType("Part-Time").build();
//        System.out.println(lecturerSubject);


//        Subject subject  = new Subject.SubjectBuilder().setSubjectCode("ADP3")
//                .setSubjectName("Appications Develpments Practice 3")
//                .setDuration("3 years")
//                .setEnrollmentCapacity(150)
//                .setSubjectCredits(30)
//                .buildSubject();
//
//        System.out.println(subject);
//        StudentSubject stdSubj = new StudentSubject.StudentSubjectBuilder().setStudent(student).setSubject(subject).buildStudentSubject();
//        System.out.println(stdSubj);

    Subject subject = SubjectFactory.buildSubject("ADP3", "Appications Develpments Practice 3",
                                                  "Application Development using Java programming language",
                                                  "3 years", 30, 150) ;

        System.out.println("Subjects:");
        System.out.println(subject);


    }
}
