package icpc.tab1;

import java.lang.*;
import java.util.*;
import java.io.*;
public class cf268d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int ans=0;
        Map<Integer,Integer>map=new HashMap<>();
        int [] home=new int[n];
        for(int i=0;i<n;i++){
            home[i]=fs.nextInt();
            int guest=fs.nextInt();
            map.put(guest,map.getOrDefault(guest,0)+1);
        }
        for(int i=0;i<n;i++){
            ans+=map.getOrDefault(home[i],0);
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
