package icpc.tab1;

import java.util.Scanner;

public class cf683d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        if(n>m){
            long t=m;
            m=n;
            n=t;
        }
        long count=0;
        for(long i=1;i<=n;i++){
            count+=((m+i)/5)-(i/5);
        }
        System.out.print(count+"\n");
    }
}
