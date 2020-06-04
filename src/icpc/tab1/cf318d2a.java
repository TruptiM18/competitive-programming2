package icpc.tab1;

import java.util.Scanner;

public class cf318d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long oddNums=(long)Math.ceil((double)n/2);
        long ans;
        if(k<=oddNums){
            ans=1+2*(k-1);
        }
        else{
            ans=2+2*(k-oddNums-1);
        }
        System.out.print(ans+"\n");
    }
}
