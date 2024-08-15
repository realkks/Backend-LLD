package GeneralCode;

import java.util.*;
//Stack

public class General {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,8,10};
        int ans = eqIndex(a);
        System.out.println(ans);
    }
    public static int eqIndex(int[] a){
        int n = a.length;
        int [] pfSum = new int[n];
        pfSum[0] = a[0];
        for(int i=1;i<n;i++){
            pfSum[i] = pfSum[i-1]+a[i];
        }
        int sl=0;
        int sr = 0;
        //check for equillibrium index
        for(int i=0;i<n;i++){
            if(i==0){
                sl = 0;
                sr = pfSum[n-1]-pfSum[i];
                if(sl==sr)
                    return i;
            }
            else if(i==n-1){
                sl = pfSum[n-2];
                sr = 0;
                if(sl == sr)
                    return i;
            }
            else {
                sl = pfSum[i - 1];
                sr = pfSum[n - 1] - pfSum[i];
                if (sl == sr)
                    return i;
            }
        }
        return -1;

    }
}

