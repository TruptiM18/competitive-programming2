package leetcode;

class leetcode1503 {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxl=0;
        for(int i=0;i<left.length;i++)  maxl=Math.max(maxl,left[i]);
        int minr=n;
        for(int i=0;i<right.length;i++) minr=Math.min(minr,right[i]);
        return Math.max(Math.abs(maxl-0),Math.abs(n-minr));
    }
}