package za.ac.cput.domain;
//Mlungisi Mbuyazi
// 221164014
// https://github.com/Skiet88/universitycourse
public class Subject {
    private String subjectCode;
    private String subjectName;
    private String description;
    private String duration;
    private int courseCredits;
    private int enrollmentCapacity;

    private Subject(){}

    private Subject(SubjectBuilder builder){
     this.subjectCode =   builder.subjectCode;
     this.subjectName = builder.subjectName;
     this.description = builder.description;
     this.courseCredits = builder.courseCredits;
     this.enrollmentCapacity = builder.enrollmentCapacity;

    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getDescription() {
        return description;
    }

    public String getDuration() {
        return duration;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public int getEnrollmentCapacity() {
        return enrollmentCapacity;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", description='" + description + '\'' +
                ", duration='" + duration + '\'' +
                ", courseCredits=" + courseCredits +
                ", enrollmentCapacity=" + enrollmentCapacity +
                '}';
    }

    public static class SubjectBuilder{
        private String subjectCode;
        private String subjectName;
        private String description;
        private String duration;
        private int courseCredits;
        private int enrollmentCapacity;

        public SubjectBuilder setSubjectCode(String subjectCode){
            this.subjectCode = subjectCode;
            return this;

        }
        public SubjectBuilder setSubjectName(String subjectName){
            this.subjectName = subjectName;
            return this;

        }
        public SubjectBuilder setDescription(String description){
            this.description = description;
            return this;

        }
        public SubjectBuilder setDuration(String duration){
            this.duration = duration;
            return this;

        }
        public SubjectBuilder setSubjectCredits(int courseCredits){
            this.courseCredits = courseCredits;
            return this;

        }
        public SubjectBuilder setEnrollmentCapacity(int enrollmentCapacity){
            this.enrollmentCapacity = enrollmentCapacity;
            return this;

        }

       public Subject buildSubject(){
         return new Subject(this);

       }



    }
}
