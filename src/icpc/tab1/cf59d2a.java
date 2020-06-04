package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf59d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        String s=fs.next();
        int lower=0;
        int upper=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z')    upper++;
            else if(c>='a' && c<='z')   lower++;
        }
        if(upper<=lower){
            System.out.print(s.toLowerCase()+"\n");
        }
        else{
            System.out.print(s.toUpperCase()+"\n");
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
