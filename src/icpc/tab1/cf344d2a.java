package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf344d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        String [] arr=new String[n];
        int group=0;
        for(int i=0;i<n;i++){
            arr[i]=fs.next();
        }
        int i=0;
        while(i<n){
            while(i+1<n && arr[i].equals(arr[i+1])){
                i++;
            }
            i++;
            group++;
        }
        System.out.print(group+"\n");
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
