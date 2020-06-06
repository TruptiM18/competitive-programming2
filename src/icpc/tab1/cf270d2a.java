package icpc.tab1;

import java.util.Scanner;

public class cf270d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int deg = sc.nextInt();
            int sector = 180 - deg;
            if (360 % sector == 0) {
                System.out.print("YES\n");
            } else {
                System.out.print("NO\n");
            }
        }
    }
}
