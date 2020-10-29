package codeforces.cf1437;

import java.util.Scanner;

public class cf1437d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            if (r / (2 * l) >= 1) {
                System.out.print("NO\n");
            } else {
                System.out.print("YES\n");
            }
        }

    }
}
