package kickstart.d2020;

import java.io.*;
import java.util.*;

public class AlienPiano {
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        int T=fs.nextInt();
        for(int t=0;t<T;t++){
            int K=fs.nextInt();
            int [] a=new int[K];
            for(int k=0;k<K;k++){
                a[k]=fs.nextInt();
            }
            int h=0;int l=0; int b=0;
            for(int i=1;i<K;i++){
                if(a[i-1] < a[i]){
                    l=0;
                    h++;
                }
                else if(a[i-1]>a[i]){
                    h=0;
                    l++;
                }
                if(h>=4 || l>=4){
                    b++;
                    h=0;l=0;
                }
            }
            System.out.print("Case #"+(t+1)+": "+b+"\n");
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
