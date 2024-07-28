package ComparatorAndComparable;

import java.util.Comparator;

public class ComparatorOnRollNo implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        if(s1.roll_no>s2.roll_no) return -1;
        else if (s1.roll_no < s2.roll_no ) return 1;
        else return 0;
    }
}
