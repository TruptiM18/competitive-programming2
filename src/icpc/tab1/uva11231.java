package icpc.tab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class uva11231 {
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        StringBuilder sb = new StringBuilder();
        while(true) {
            long rows = fs.nextLong();
            long cols = fs.nextLong();
            long rightBottom = fs.nextLong();
            if(rows==0 && cols==0 && rightBottom==0){
                break;
            }
            long mult = (rows - 7) * (cols - 7);
            long ans;
            if (mult % 2 == 1) {
                if (rightBottom == 1) {
                    ans = (mult / 2) + 1;
                } else {
                    ans = mult / 2;
                }
            } else {
                ans = mult / 2;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb.toString());
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
