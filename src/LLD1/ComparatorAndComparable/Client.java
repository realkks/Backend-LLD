package LLD1.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student(2, "Raju"));
        s.add(new Student(1, "Aman"));
        s.add(new Student(3, "Akash"));
        System.out.println(s.get(0).name);
        System.out.println(s.get(1).name);
        System.out.println(s.get(2).name);
        Collections.sort(s,new ComparatorOnRollNo());
        for (Student st : s) {
            System.out.println(st.name);
        }

    }
}
