package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf799d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int cakes=fs.nextInt();
        int time=fs.nextInt();
        int cakescap=fs.nextInt();
        int ovent=fs.nextInt();
        int t1=0;
        int c=0;
        while(c<cakes) {
            t1++;
            if (t1 % time == 0) {
                c += cakescap;
            }
        }
        c=0;
        int t2=0;
        while(c<cakes){
            t2++;
            if(t2%time==0){
                c+=cakescap;
            }
            if(t2>ovent && ((t2-ovent)%time)==0){
                c+=cakescap;
            }
        }
        //System.out.print(t1+" "+t2+"\n");
        if(t1<=t2)  System.out.print("NO\n");
        else System.out.print("YES\n");
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
