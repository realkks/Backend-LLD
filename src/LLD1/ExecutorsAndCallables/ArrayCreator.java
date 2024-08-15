package LLD1.ExecutorsAndCallables;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable <ArrayList<Integer>>{
    int n;
    ArrayCreator(int n){
        this.n = n;
    }
    public ArrayList<Integer> call () {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(i);
        }
        return al;
    }
}
