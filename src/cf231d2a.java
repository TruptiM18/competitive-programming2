import java.lang.*;
import java.util.*;
import java.io.*;
public class cf231d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<3;j++){
                if(fs.nextInt()==1){
                    cnt++;
                }
            }
            if(cnt>=2)  ans++;
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
