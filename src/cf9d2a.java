import java.lang.*;
import java.util.*;
import java.io.*;
public class cf9d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int Y=fs.nextInt();
        int W=fs.nextInt();
        int numerator=6-(Math.max(Y,W)-1);
        int denom=6;
        int lcm=lcm(numerator,denom);
        System.out.print((numerator/lcm)+"/"+(denom/lcm)+"\n");

    }
    static int lcm(int a, int b){
        if(b==0)
            return a;
        return lcm(b,a%b);
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
