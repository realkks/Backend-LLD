package LLD1.ThreadAndProcess;

public class Adder implements Runnable{
    int n;
    Adder (int n){
        this.n = n;
    }
    public void run(){
        System.out.println("I am the adder class "+ Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
        //System.out.println(n+" "+ Thread.currentThread().getName());
    }
}
