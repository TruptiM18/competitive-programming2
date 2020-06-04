package icpc.tab1;

import java.util.*;
public class cf1d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();
        long sqn=(long)Math.ceil((double)n/a);
        long sqm=(long)Math.ceil((double)m/a);
        long ans=sqn*sqm;
        System.out.print(ans+"\n");
    }
}
