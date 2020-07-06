package icpc.tab1;

import java.io.*;
import java.util.*;

public class uva10611 {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int [] chimps=new int [n];
        for(int i=0;i<n;i++){
            chimps[i]=fs.nextInt();
        }
        int Q=fs.nextInt();
        for(int q=0;q<Q;q++){
            int luchu=fs.nextInt();
            int l=0;int r=n-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(chimps[mid]<luchu){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            //ans: l where chimps[l]<lunchu
            if(r<0)   System.out.print("X ");
            else System.out.print(chimps[r]+" ");
            l=0; r=n-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(chimps[mid]<=luchu){
                    l=mid+1;
                }
                else {
                    r = mid - 1;
                }
            }
            if(l>=n)  System.out.print("X\n");
            else System.out.print(chimps[l]+"\n");

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
