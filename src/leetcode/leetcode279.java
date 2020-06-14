package leetcode;

import java.util.Arrays;

public class leetcode279 {
    public int numSquares(int n) {
        int [] ans=new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        for(int i=1;i*i<=n;i++){
            ans[i*i]=1;
        }
        for(int i=2;i<=n;i++){
            int l=1;int r=i-1;
            while(l<=r){
                ans[i]=Math.min(ans[l]+ans[r],ans[i]);
                l++;
                r--;
            }
        }
        return ans[n];
    }
}
