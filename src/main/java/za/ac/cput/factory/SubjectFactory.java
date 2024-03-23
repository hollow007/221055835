package za.ac.cput.factory;

import za.ac.cput.domain.Subject;
import za.ac.cput.util.SubjectHelper;

//Mlungisi Mbuyazi
// 221164014
// https://github.com/Skiet88/universitycourse
public class SubjectFactory {

    public static Subject buildSubject(String subjectCode, String subjectName, String description, String duration, int credits, int enrollmentcapacity){
        if(SubjectHelper.isEmpty(subjectCode) || SubjectHelper.isEmpty(subjectName) || SubjectHelper.isEmpty(description) || SubjectHelper.isEmpty(duration) ||  SubjectHelper.isIntEmpty(enrollmentcapacity)){
            return  null;
        }

        return new Subject.SubjectBuilder().setSubjectCode(subjectCode)
                .setSubjectName(subjectName)
                .setDescription(description)
                .setDuration(duration)
                .setSubjectCredits(credits)
                .setEnrollmentCapacity(enrollmentcapacity)
                .buildSubject();
    }


    public static Subject buildSubject(String subjectCode, String subjectName){
        if(SubjectHelper.isEmpty(subjectCode) || SubjectHelper.isEmpty(subjectName)){
            return  null;
        }

        return new Subject.SubjectBuilder().setSubjectCode(subjectCode)
                .setSubjectName(subjectName)
                .buildSubject();
    }




}
