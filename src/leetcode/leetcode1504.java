package leetcode;

//DP + largest rectangle in histogram
class leetcode1504 {
    public int numSubmat(int[][] mat) {
        int n=mat.length; int m=mat[0].length;
        int [][] prefix=new int[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0)    prefix[i][j]=0;
                else{
                    prefix[i][j]=(j==0)? 1 : prefix[i][j-1]+1;
                }
            }
        }
        for(int i=0;i<n;i++){
            int maxi=prefix[i][0];
            for(int j=1;j<m;j++){
                maxi=Math.max(maxi,prefix[i][j]);
                prefix[i][j]=maxi;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans+=prefix[i][j];
            }
        }
        return ans;
    }
}
