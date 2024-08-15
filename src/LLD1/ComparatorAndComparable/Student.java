package LLD1.ComparatorAndComparable;

public class Student implements Comparable <Student> {
    int roll_no;
    String name;
    Student (int roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    public int compareTo(Student s){
        if(roll_no > s.roll_no) return 1;
        else if (roll_no < s.roll_no) {
            return -1;
        }
        else{
            return 0;
        }
    }
    public int compare(Student s1,Student s2){
        if(s1.roll_no > s2.roll_no) return 1;
        else if (s1.roll_no < s2.roll_no) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
