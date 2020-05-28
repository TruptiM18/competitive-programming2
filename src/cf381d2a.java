import java.lang.*;
import java.util.*;
import java.io.*;
public class cf381d2a {
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=fs.nextInt();
        }
        int []p=new int[2];
        int l=0;int r=n-1;
        int p1turn=0;
        while(l<=r){
            if(arr[l] > arr[r]){
                p[p1turn]+=arr[l];
                l++;
            }
            else if(arr[l] < arr[r]){
                p[p1turn]+=arr[r];
                r--;
            }
            else{
                p[p1turn]+=arr[r];
                r--;
            }
            p1turn=(p1turn+1)%2;
        }
        System.out.print(p[0]+ " "+p[1]+"\n");
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
