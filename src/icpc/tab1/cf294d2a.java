package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf294d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int [] wires=new int [n+1];
        for(int i=1;i<=n;i++)
            wires[i]=fs.nextInt();
        int m=fs.nextInt();
        for(int i=0;i<m;i++){
            int x=fs.nextInt();
            int y=fs.nextInt();
            if(x-1>0)  wires[x-1]+=y-1;
            if(x+1<=n)  wires[x+1]+=wires[x]-y;
            wires[x]=0;
        }
        for(int i=1;i<=n;i++)
            System.out.print(wires[i]+"\n");
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
