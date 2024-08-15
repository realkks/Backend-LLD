package DesignPatterns.PrototypeDP;

// This is a creational design pattern .
// The intelligent class is extending the student class . And we will create copy of student object or intelligent object .

public class Client {
    // This method will fill the object in registry
    public static void fillregistry(StudentRegistry sr){
        Student apr23st = new Student();
        apr23st.id=2;
        apr23st.name="Akash";
        apr23st.age=21;
        sr.register("April23Student",apr23st);       // Here it will store april23student object in Student Registry
    }
    public static void main(String[] args) {
        // Create student registry object to store object of Students ;
        StudentRegistry studentRegistry = new StudentRegistry();
        fillregistry(studentRegistry);

        Student s = new Student();
        s.name = "karan";
        s.age=20;
        s.id=1;
        s.copy();

        // we can get the object from registry
        Student s1 = studentRegistry.get("April23Student");
    }
}
