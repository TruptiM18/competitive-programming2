import java.lang.*;
import java.util.*;
import java.io.*;
public class cf431d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int ans=0;
        int [] a=new int[5];
        for(int i=1;i<5;i++){
            a[i]=fs.nextInt();
        }
        String s=fs.next();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ans+=a[c-'0'];
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
