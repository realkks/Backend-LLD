package LLD1.ThreadAndProcess;

//
// RUNNABLE INTERFACE IS USED TO RUN THREAD . METHOD IS RUN().
// WE PROVIDE OBJECT OF THE CLASS WHICH IMPLEMENTS RUNNABLE INTERFACE AS AN ARGUMENT TO THREAD CLASS.
// START() METHOD IS USED TO START THE THREAD EXECUTION .
// THREADS OF SAME PROCESS CAN ACCESS EACH OTHER'S GLOBAL DATA .
// PARALLEL PROGRAMMING REQUIRES MULTIPLE PROGRAM COUNTER (CURRENT LINE OF EXECUTION) .
// WE USE RUNNABLE INTERFACE WHEN WE DON'T REQUIRE ANY OUTPUT .
// METHODS FOR THREADS ARE STOP() - TO STOP THREAD EXECUTION AND START() - TO START THE THREAD EXECUTION .



public class Main {
    public static void main(String[] args) {
        Adder a = new Adder(5);
        //System.out.println("I am the main class");
        ScalerThread t = new ScalerThread(a);
        t.start();
//        Subtractor s = new Subtractor();
//        Thread t2 = new Thread(s);
//        t2.start();

    }
}
