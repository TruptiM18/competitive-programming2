import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

class uva12148 {
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        StringBuilder sb=new StringBuilder();
        while(true){
            int n=fs.nextInt();
            if(n==0)    break;
            int d = fs.nextInt();
            int m = fs.nextInt();
            int y = fs.nextInt();
            int c= fs.nextInt();
            LocalDate prevdate = LocalDate.of(y, m, d);
            int prevc=c;
            int consumption=0;
            int days=0;
            for(int t=1;t<n;t++) {
                d = fs.nextInt();
                m = fs.nextInt();
                y = fs.nextInt();
                c = fs.nextInt();
                LocalDate date=LocalDate.of(y,m,d);
                long daysElapsed= ChronoUnit.DAYS.between(prevdate,date);
                if(daysElapsed==1){
                    days++;
                    consumption+=c-prevc;
                }
                prevdate=date;
                prevc=c;
            }
            sb.append(days).append(" ").append(consumption).append("\n");
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
