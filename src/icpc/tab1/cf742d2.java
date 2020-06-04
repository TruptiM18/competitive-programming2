package icpc.tab1;

import java.util.Scanner;

public class cf742d2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n==0){
            System.out.print(1+"\n");
        }
        else {
            n--;
            long r = n % 4;
            int ans = 0;
            if (r == 0)
                ans = 8;
            else if (r == 1)
                ans = 4;
            else if (r == 2)
                ans = 2;
            else if (r == 3)
                ans = 6;
            System.out.print(ans + "\n");
        }
    }
}
