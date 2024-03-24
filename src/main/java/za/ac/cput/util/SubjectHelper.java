package za.ac.cput.util;
//Mlungisi Mbuyazi
// 221164014
// https://github.com/Skiet88/universitycourse
public class SubjectHelper {
    public static boolean isEmpty(String s){
        if (s == null ||  s.isEmpty()){return true;}
        return false;
    }

    public static boolean isIntEmpty(Integer n){
        if(n == 0)
            return true;
        return false;

    }

}
