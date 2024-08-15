package DesignPatterns.SingletonClassDP;

// This is a creational design pattern .
public class Main {
    public static void main(String[] args) {
        // Issue:1 - we don't allow to class have more than one object , here we can have easily more than 1 objects.
//        DbConnection db1 = new DbConnection();
//        DbConnection db2 = new DbConnection() ;
//        System.out.println(db1+"-"+db2);

        // Sol:1 - We can make constructor private so , that we can call only from inside the class . Create another method to call
        // constructor and make method static so that we can access that method using classname.

        // Issue:2 - Issues not get resolved , we still can have more than 1 objects .
        DbConnection db1 = DbConnection.getInstance();
        DbConnection db2 = DbConnection.getInstance();
        System.out.println(db1+"-"+db2);

        //Sol:2 - Create DbConnection instance and initialize as null . Make it static so that it can be used inside static method .

         //Issue:3 - That singleton program will only work for single thread , for multi-thread, there will be synchronization issue .
//        DbConnection db1 = DbConnection.getInstance();
//        DbConnection db2 = DbConnection.getInstance();
//        System.out.println(db1+"-"+db2);

        //Sol:3 -we can call constructor at class loading which happens only one time , in this way constructor  will get assigned
        // Reference variable and only one object will be created . After that same object will be assigned to reference as well .

        //Issue:4 - start time increases and cannot provide parameters to constructors .

        //Sol:4 - To handle issue-4 we can use synchronized keyword for method or use lock in Critical Section . In this way
        // we can use multi-threading and no sync-issue happen.

        //Issue5: Here only one thread can enter and have object , due to which there will be performance low .

        //Sol:5 - UseDouble check .







    }
}
