package icpc.tab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva10452 {
    private static final String target="@IEHOVA#";
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        StringBuilder sb=new StringBuilder();
        int T=fs.nextInt();
        for(int t=0;t<T;t++){
            int m=fs.nextInt();
            int n=fs.nextInt();
            String [] map=new String[m];
            for(int i=0;i<m;i++){
                map[i]=fs.next();
            }
            int startcol=0;
            for(int i=0;i<n;i++){
                if(map[m-1].charAt(i)=='@'){
                    startcol=i;
                    break;
                }
            }
            dfs(m-1,startcol,map,1,sb);
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
    static void dfs(int i,int j,String [] map,int targetInd,StringBuilder sb){
        if(targetInd>=target.length())    return;
        int [] x={-1,0,0};
        int [] y={0,-1,1};
        String [] d={"forth","left","right"};
        for(int k=0;k<x.length;k++){
            int x1=i+x[k];
            int y1=j+y[k];
            if(x1>=0 && x1<map.length && y1>=0 && y1<map[0].length() &&
                    map[x1].charAt(y1)==target.charAt(targetInd)){
                sb.append(d[k]);
                if(target.charAt(targetInd)!='#'){
                    sb.append(" ");
                }
                dfs(x1,y1,map,targetInd+1,sb);
            }
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
