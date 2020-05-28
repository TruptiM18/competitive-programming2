import java.lang.*;
import java.io.*;
import java.util.*;

public class cf792d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int a=fs.nextInt();
        int b=fs.nextInt();
        double dans=Math.log10((double)b/a)/Math.log10((double) 3/2);
        double ceil=Math.ceil(dans);
        if(ceil > dans){
            System.out.print((int)ceil+"\n");
        }
        else{
            ceil++;
            System.out.print((int)ceil+"\n");
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
