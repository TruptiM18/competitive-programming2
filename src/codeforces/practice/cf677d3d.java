package codeforces.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class cf677d3d {
    public static void main(String[] args) {
        FastReader fs = new FastReader();

        int T= fs.nextInt();
        for(int t=0;t<T;t++){
            StringBuilder sb=new StringBuilder();
            int n=fs.nextInt();
            int firstGang=fs.nextInt();
            List<Integer> gangDistricts=new ArrayList<>();
            int secondGang=0;
            for(int i=2;i<=n;i++){
                int gang=fs.nextInt();
                if(gang==firstGang){
                    gangDistricts.add(i);
                }
                else{
                    if(secondGang==0) {
                        sb.append("YES\n");
                    }
                    secondGang=i;
                    //System.out.print("i: "+i+"\n");
                    sb.append(1+" "+i+"\n");
                }
            }
            if(secondGang==0){
                sb.append("NO\n");
            }
            else{

                for(int j=0;j<gangDistricts.size();j++){
                    sb.append(secondGang+" "+gangDistricts.get(j)+"\n");
                }
            }
            System.out.print(sb.toString());
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
