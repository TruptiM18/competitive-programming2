package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf405d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=fs.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
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
