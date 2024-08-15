package DesignPatterns.PrototypeDP;

public class Student implements Prototype<Student> {
    int id;
    String name;
    int age;
    Student(){

    }

    // If we want to use copy using copy constructor , make a copy constructor and assign all values in constructor .
    //e.g
     Student(Student other){
        this.id = other.id;
        this.name=other.name;
        this.age=other.age;
    }

    // implementing copy method to return copy of student object
    public Student copy(){
        System.out.println("Student");
        //For copy constructor
        Student s = new Student(this);
        return s;
    }

}
