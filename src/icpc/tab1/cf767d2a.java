package icpc.tab1;

import java.util.Scanner;

public class cf767d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=sc.nextInt();
        boolean[] snacks=new boolean[n+1];
        int k=n;
        for(int i=1;i<=n;i++){
            int csnack=sc.nextInt();
            if(csnack!=k){
                snacks[csnack]=true;
                sb.append("\n");
            }
            else{
                int l=csnack;
                snacks[csnack]=true;
                while(l>=0 && snacks[l]){
                    sb.append(l).append(" ");
                    l--;
                }
                k=l;
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
