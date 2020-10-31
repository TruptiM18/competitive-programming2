package codeforces.practice;

import java.util.Scanner;

public class cf1413d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int n=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i+=2){
                int x=sc.nextInt();
                int y=sc.nextInt();
                sb.append(y).append(" ").append((-1*x)).append(" ");
            }
            System.out.print(sb.toString()+"\n");
        }
    }
}
