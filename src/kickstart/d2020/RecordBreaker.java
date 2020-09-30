package kickstart.d2020;

import java.io.*;
import java.util.*;

class RecordBreaker {
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        int T=fs.nextInt();
        for(int t=0;t<T;t++){
            int N=fs.nextInt();
            int [] visitors=new int [N];
            for(int i=0;i<N;i++){
                visitors[i]=fs.nextInt();
            }
            int max=0; int ans=0;
            for(int i=0;i<N;i++){
                if(max<visitors[i] && (i==N-1 || visitors[i+1]<visitors[i])){
                    ans++;
                }
                max=Math.max(max,visitors[i]);
            }
            System.out.print("Case #"+(t+1)+": "+ans+"\n");
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
