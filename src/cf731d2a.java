import java.lang.*;
import java.util.*;
import java.io.*;
public class cf731d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int ans=0;
        String s="a"+fs.next();
        for(int i=0;i<s.length()-1;i++){
            int c1=s.charAt(i);
            int c2=s.charAt(i+1);
            int sub1=Math.max(c1,c2)-Math.min(c1,c2);
            int sub2=26-sub1;
            ans+=Math.min(sub1,sub2);

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
