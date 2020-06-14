package leetcode;

public class leetcode5455 {
    public int minDays(int[] A, int m, int k) {
        int n=A.length;
        if(n<m*k)   return -1;
        int Amax=0;
        for(int i=0;i<n;i++){
            Amax=Math.max(Amax,A[i]);
        }
        int l=1; int r=Amax;
        while(l<r){
            int mid=(l+r)/2;
            int f=0;
            int b=0;
            for(int i=0;i<n;i++){
                if(A[i] > mid){
                    f=0;

                }
                else{
                    f++;
                    if(f==k){
                        b++;
                        f=0;
                    }
                }
            }
            if(b<m){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return r;
    }
}
