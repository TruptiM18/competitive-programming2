package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf732d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int k=fs.nextInt();
        int r=fs.nextInt();
        int i=1;
        for(;i<=10;i++){
            int price=i*k;
            if(price%10 == 0){
                break;
            }
            else if(price%10==r){
                break;
            }
        }
        System.out.print(i+"\n");
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
