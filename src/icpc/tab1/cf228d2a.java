package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf228d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<4;i++){
            set.add(fs.nextInt());
        }
        System.out.print(4-set.size()+"\n");
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
