package icpc.tab1;

import java.io.*;
import java.util.*;
import java.lang.*;
public class cf734d2a {
    public static void main(String[] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        String s=fs.next();
        int D=0,A=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'A')  A++;
            else    D++;
        }
        if(A>D){
            System.out.print("Anton\n");
        }else if(A<D){
            System.out.print("Danik\n");
        }
        else{
            System.out.print("Friendship\n");
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
