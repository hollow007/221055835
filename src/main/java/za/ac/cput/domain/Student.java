package za.ac.cput.domain;

/**
 * Mpumzi Mbula
 * 219053324
 * Date:22/03/2024
 * Student.java
 */
public class Student {
    private String studentNumber;
    private String idNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private String ethnicity;
    private Contact contact;


    private Student() {

    }
    private Student(StudentBuilder builder){
        this.studentNumber= builder.studentNumber;
        this.idNumber= builder.idNumber;
        this.firstName= builder.firstName;
        this.lastName= builder.lastName;
        this.gender=builder.gender;
        this.ethnicity= builder.ethnicity;
        this.contact=builder.contact;

    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public Contact getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", contact=" + contact +
                '}';
    }

    public static class StudentBuilder {
        private String studentNumber;
        private String idNumber;
        private String firstName;
        private String lastName;
        private String gender;
        private String ethnicity;
        private Contact contact;



        public StudentBuilder setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }

        public StudentBuilder setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setEthnicity(String ethnicity) {
            this.ethnicity = ethnicity;
            return this;
        }

        public StudentBuilder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

}
