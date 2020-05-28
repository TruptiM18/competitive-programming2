import java.lang.*;
import java.util.*;
import java.io.*;
public class cf709d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int b=fs.nextInt();
        int d=fs.nextInt();
        int [] o=new int[n];
        for(int i=0;i<n;i++){
            o[i]=fs.nextInt();
        }
        int dsize=0; int ans=0;
        for(int i=0;i<n;i++){
            if(o[i] <= b){
                dsize+=o[i];
            }
            if(dsize >d){
                ans++;
                dsize=0;
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
