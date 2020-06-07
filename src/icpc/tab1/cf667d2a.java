package icpc.tab1;

import java.util.*;
public class cf667d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d,h,v,e;
        d=sc.nextInt();
        h=sc.nextInt();
        v=sc.nextInt();
        e=sc.nextInt();
        double t=(Math.PI*d*d*h)/(4*v-Math.PI*d*d*e);
        if(t<0) System.out.print("NO\n");
        else{
            System.out.printf("YES\n%.12f\n",t);
        }
    }
}
