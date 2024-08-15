package LLD1.ThreadAndProcess;

public class Subtractor implements Runnable {
    public void run(){
        System.out.println("I am the Subtractor "+Thread.currentThread().getName());
    }
}
