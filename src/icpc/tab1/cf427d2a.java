package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf427d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int e=fs.nextInt();
        int manpower=0;
        int ans=0;
        for(int i=0;i<e;i++){
            int curr=fs.nextInt();
            if(curr==-1){
                if(manpower==0) ans++;
                else    manpower--;
            }
            else{
                manpower+=curr;
            }
        }
        System.out.print(ans+"\n");
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
