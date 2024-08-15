
// EXCECUTORSERVICE IS AN INTERFACE WHICH EXTENDS EXECUTORS CLASS TO CREATE THREADPOOL .
// THREADPOOL IS A POOL WHICH CAN HAVE MULTIPLE THREADS ,AND YOU DON'T NEED TO CREATE THREAD AGAIN AND AGAIN .
// EXECUTORS USES NEWCACHEDTHREADPOOL () - IT AUTOMATICALLY CREATE THREAD ACCORDING TO THEIR REQUIREMENT AND
// NEWFIXEDTHREADPOOL(N) - IT WILL CREATE N NOS. OF THREAD AND WHEN ONE THREADS GET COMPLETED THREADPOOL WILL AGAIN ASSIGN TASK IF REMAINS .
// CALLABLE INTERFACE USES CALL() METHOD , WHICH ALSO RETURN DATA . CALL() METHOD IS A GENERIC . THAT MEANS IT CAN ACCEPT ANY TYPE
// OF ARGUEMENTS AND RETURN THE SAME .
// EXECUTORSERVICE USE SUBMIT() METHOS TO RUN THE THREADS IN THREADPOOL , AFTER COMPLETEION OF THE TASK , THE THREAD RETURN FUTURE
// OF GENERIC TYPE . TO GET THE DATA FROM THE THREAD , WE USES GET() METHOD , SO THAT AFTER COMPLETION OF THREAD IT WAIT FOR DATA .




package LLD1.ExecutorsAndCallables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Node n = new Node(1);
//        n.left=new Node(2);
//        n.right = new Node(3);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayCreator ac = new ArrayCreator(n);
        ExecutorService es = Executors.newCachedThreadPool();
        //TreeSizeCalculator tsc = new TreeSizeCalculator(n,es);
        Future<ArrayList<Integer>>  al = es.submit(ac);
        ArrayList<Integer> ans = al.get();
        System.out.println(Arrays.toString(ans.toArray()));
    }
}
