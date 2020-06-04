package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf263d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int num=fs.nextInt();
                if(num==1){
                    int ans=Math.abs(i-2)+Math.abs(j-2);
                    System.out.print(ans+"\n");
                }
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
