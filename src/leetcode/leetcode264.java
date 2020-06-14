package leetcode;

import java.util.*;

public class leetcode264 {
    public int nthUglyNumber(int n) {
        if(n==1)    return 1;
        List<Integer> ugly=new ArrayList<>();
        ugly.add(1);
        int p1=0; int p2=0; int p3=0;
        for(int i=1;i<n;i++){
            int nextugly=Math.min(ugly.get(p1)*2,Math.min(ugly.get(p2)*3,ugly.get(p3)*5));
            ugly.add(nextugly);
            if(ugly.get(p1)*2 == nextugly)  p1++;
            if(ugly.get(p2)*3 == nextugly)  p2++;
            if(ugly.get(p3)*5 == nextugly)  p3++;
        }
        return ugly.get(n-1);
    }
}
