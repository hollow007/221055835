package za.ac.cput.domain;

import java.time.LocalDate;

/* LecturerSubject.java
   LecturerSubject model class
   Author: Cavan Ramone Swartz (221055835)
   Date: 22 March 2024
 */
public class LecturerSubject {

    private Lecturer lecturer;
    private Subject subject;
    private LocalDate assignmentDate;
    private String contractType;
    private String roomNumber;

    private LecturerSubject() {

    }

    private LecturerSubject(LecturerSubjectBuilder builder){
        this.lecturer = builder.lecturer;
        this.subject = builder.subject;
        this.assignmentDate = builder.assignmentDate;
        this.contractType = builder.contractType;
        this.roomNumber = builder.roomNumber;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public Subject getSubject() {
        return subject;
    }

    public LocalDate getAssignmentDate() {
        return assignmentDate;
    }

    public String getContractType() {
        return contractType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "LecturerSubject{" +
                "lecturer=" + lecturer +
                ", subject=" + subject +
                ", assignmentDate=" + assignmentDate +
                ", contractType='" + contractType + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }

    public LecturerSubject build() {
        return null;
    }

    public static class LecturerSubjectBuilder{
        private Lecturer lecturer;
        private Subject subject;
        private LocalDate assignmentDate;
        private String contractType;
        private String roomNumber;

        public void setLecturer(Lecturer lecturer) {
            this.lecturer = lecturer;
        }

        public void setSubject(Subject subject) {
            this.subject = subject;
        }

        public void setAssignmentDate(LocalDate assignmentDate) {
            this.assignmentDate = assignmentDate;
        }

        public LecturerSubject setContractType(String contractType) {
            this.contractType = contractType;
            return null;
        }

        public void setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
        }

        public LecturerSubject build(){
            return new LecturerSubject(this);
        }
    }



}
