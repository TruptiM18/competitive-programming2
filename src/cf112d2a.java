import java.lang.*;
import java.util.*;
import java.io.*;
public class cf112d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        String s1=fs.next();
        String s2=fs.next();
        int compare=s1.toUpperCase().compareTo(s2.toUpperCase());
        if(compare<0) {
            System.out.print("-1\n");
        }
        else if(compare>0){
            System.out.print("1\n");
        }
        else{
            System.out.print("0\n");
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