package icpc.tab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class uva10110 {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        while(true){
            long lb=fs.nextLong();
            if(lb==0)   break;
            long sqrt=(long)Math.sqrt(lb);
            if(sqrt*sqrt==lb){
                System.out.print("yes\n");
            }
            else{
                System.out.print("no\n");
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
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
