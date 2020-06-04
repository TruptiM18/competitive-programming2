package icpc.tab1;

import java.util.Scanner;

class uva11953 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int n=sc.nextInt();
            String [] sea=new String[n];
            for(int i=0;i<n;i++){
                sea[i]=sc.next();
            }
            boolean [][] visit=new boolean[n][n];
            int ships=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(!visit[i][j] && sea[i].charAt(j)=='x'){
                        ships++;
                        dfs(sea,visit,i,j);
                    }
                }
            }
            sb.append("Case "+(t+1)+": "+ships+"\n");
        }
        System.out.print(sb.toString());
    }
    static boolean isGoodCell(int i,int j,int n){
        return (i>=0 && i<n && j>=0 && j<n);
    }
    static void dfs(String [] sea, boolean[][]visit,int i, int j){
        int n=sea.length;
        if(!isGoodCell(i,j,n))  return;
        if(visit[i][j]) return;
        visit[i][j]=true;
        if(sea[i].charAt(j)=='.')   return;
        //System.out.print(sea[i].charAt(j)+" "+visit[i][j]+" "+i+" "+j+"\n");
        int [] dx={-1,0,1,0};
        int [] dy={0,1,0,-1};
        for(int k=0;k<dx.length;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            if (isGoodCell(x,y,n) && !visit[x][y] && sea[x].charAt(y)!='.'){
                dfs(sea,visit,x,y);
            }
        }
    }
}
