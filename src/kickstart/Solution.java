package kickstart;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        StringBuilder sb=new StringBuilder();
        int T=fs.nextInt();
        for(int t=1;t<=T;t++) {
            int N=fs.nextInt();
            int A=fs.nextInt();
            int B=fs.nextInt();
            int C=fs.nextInt();
            if(A<C || B<C || (A+B-C)>N || (A+B-C)<=0 ||
                    (N==2 & A==1 && B==1 && C==1)){
                sb.append("Case #"+t+": IMPOSSIBLE\n");
            }
            else{
                int onlyA=A-C;
                int onlyB=B-C;
                int nobodySee=N-(A+B-C);
                StringBuilder tmp=new StringBuilder();
                for(int i=0;i<onlyA;i++){
                    tmp.append("1 ");
                }
                tmp.append(N+" ");
                for(int i=0;i<nobodySee;i++){
                    tmp.append("1 ");
                }
                for(int i=0;i<C-1;i++){
                    tmp.append(N+" ");
                }
                if(C==1) {
                    for (int i = 0; i < onlyB; i++) {
                        tmp.append("2 ");
                    }
                }
                else {
                    for (int i = 0; i < onlyB; i++) {
                        tmp.append("1 ");
                    }
                }
                sb.append("Case #"+t+": "+tmp.toString()+"\n");
            }
        }
        System.out.print(sb.toString());
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
