package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf266d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        String s=fs.next();
        int count=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1))  count++;
        }
        System.out.print(count+"\n");
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
