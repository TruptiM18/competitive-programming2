package icpc.tab1;

import java.util.*;
public class cf127d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        double ans=0;
        for(int i=1;i<n;i++){
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            double dist=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
            ans+=dist;
            x1=x2;
            y1=y2;
        }
        ans=ans/50.0;
        ans=ans*k;
        System.out.printf("%.9f\n",ans);
    }
}
