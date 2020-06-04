package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf265d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        String s=fs.next();
        String t=fs.next();
        int ans=1;
        for(int i=0;i<t.length();i++){
            if(s.charAt(ans-1)==t.charAt(i))
                ans++;
        }
        System.out.print(ans+"\n");
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
