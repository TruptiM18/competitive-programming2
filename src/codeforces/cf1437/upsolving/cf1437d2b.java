package codeforces.cf1437.upsolving;

import java.util.Scanner;

public class cf1437d2b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)==s.charAt((i+1)%n)){
                    ans++;
                }
            }
            System.out.print((ans/2)+"\n");
        }
    }
}
