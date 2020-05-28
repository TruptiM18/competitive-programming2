import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cf768d2a {
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        int ans=0;
        int n=fs.nextInt();
        long [] stewards=new long[n];
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            stewards[i]=fs.nextLong();
            min=Math.min(stewards[i],min);
            max=Math.max(stewards[i],max);
        }
        for(int i=0;i<n;i++){
            if(stewards[i]!=min && stewards[i]!=max){
                ans++;
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
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
