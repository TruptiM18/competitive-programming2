package icpc.tab1;

import java.util.Scanner;

public class cf766d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(a.equals(b)){
            System.out.print("-1\n");
        }
        else{
            int max=Math.max(a.length(),b.length());
            System.out.print(max+"\n");
        }
    }
}
