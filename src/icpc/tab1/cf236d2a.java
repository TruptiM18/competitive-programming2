package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf236d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        String s=fs.next();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size()%2==1){
            System.out.print("IGNORE HIM!\n");
        }
        else{
            System.out.print("CHAT WITH HER!\n");
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
