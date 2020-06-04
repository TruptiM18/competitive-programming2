package icpc.tab1;

import java.util.Arrays;
import java.util.Scanner;

public class cf160d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] coins=new int [n];
        int sum=0;
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
            sum+=coins[i];
        }
        Arrays.sort(coins);
        int j=n-1;
        int mymoney=0;
        int mycoins=0;
        while(j>=0 && mymoney<=sum-mymoney){
            mymoney+=coins[j];
            mycoins++;
            j--;
        }
        System.out.print(mycoins+"\n");

    }
}
