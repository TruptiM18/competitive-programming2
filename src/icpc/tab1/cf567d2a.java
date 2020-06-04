package icpc.tab1;

import java.util.Scanner;

public class cf567d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long [] x=new long[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            long min,max;
            if(i-1>=0 && i+1<n)
                min=Math.min(Math.abs(x[i-1]-x[i]),Math.abs(x[i+1]-x[i]));
            else if(i-1<0)
                min=Math.abs(x[i+1]-x[i]);
            else
                min=Math.abs(x[i-1]-x[i]);
            if(i!=0 && i!=n-1)
                max=Math.max(Math.abs(x[0]-x[i]),Math.abs(x[n-1]-x[i]));
            else if(i==0)
                max=Math.abs(x[n-1]-x[i]);
            else
                max=Math.abs(x[0]-x[i]);
            System.out.print(min+" "+max+"\n");
        }

    }
}
