package LLD1.ExecutorsAndCallables;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
        Node root;
        ExecutorService es;

        public TreeSizeCalculator(Node root,ExecutorService es){
            this.root = root;
            this.es = es;
        }


        public Integer call() throws Exception{
            if(root == null){
                return 0;
            }

            TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left,es);
            TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right,es);

            Future<Integer> leftTreeSize = es.submit(leftTree);
            Future<Integer> rightTreeSize = es.submit(rightTree);
            System.out.println(leftTreeSize.get() + rightTreeSize.get() +1);
            return leftTreeSize.get() + rightTreeSize.get() +1;
        }
}
