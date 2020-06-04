package icpc.tab1;/*
Inclusion–exclusion principle
-----------------------------
|A U B U C|=|A|+|B|+|C|-|A intersection B|-|A intersection C|-|B intersection C|+|A intersection B intersection C|.
In words, to count the number of elements in a finite union of finite sets,
first sum the cardinalities of the individual sets, then subtract the number of elements that appear
in at least two sets, then add back the number of elements that appear in at least three sets,
then subtract the number of elements that appear in at least four sets, and so on
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

class spojeasymath {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        StringBuilder sb=new StringBuilder();
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            long n=sc.nextLong();
            long m=sc.nextLong();
            long a=sc.nextLong();
            long d=sc.nextLong();
            long [] arr=new long[5];
            for(int i=0;i<5;i++){
                arr[i]=a+(d*i);
            }
            long ans=calculateNonDivisible(arr,m)-calculateNonDivisible(arr,n-1);
            sb.append(ans).append("\n");

        }
        System.out.print(sb.toString());
    }
    static long calculateNonDivisible(long [] arr,long n){
        long unionSize=0;
        for(int i=1;i<=31;i++){
            List <Long> set=calculateSet(i,arr);
            long lcm=lcm(set);
            if(set.size()%2==1){
                unionSize+=(n/lcm);
            }
            else {
                unionSize+= -(n/lcm);
            }
        }
        return n-unionSize;
    }
    static List<Long> calculateSet(int x,long [] arr){
        int t=1;
        List<Long> r=new ArrayList<>();
        for(int i=0;i<5;i++){
            if((t&x) != 0){
                r.add(arr[4-i]);
            }
            t=t<<1;
        }
        return r;
    }
    static long lcm(List<Long> set){
        long lcm=1;
        for(int i=0;i<set.size();i++){
            long gcd=gcd(lcm,set.get(i));
            lcm=(lcm*set.get(i))/gcd;
        }
        return lcm;
    }
    static long gcd(long a,long b){
        if(b==0)    return a;
        return gcd(b,a%b);
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
        long nextLong() {
            return Long.parseLong(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
