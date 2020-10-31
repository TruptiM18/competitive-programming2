package codeforces.practice;

import java.util.Scanner;

public class cf1436d2b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int n=sc.nextInt();
            int c=0;
            int [][]ans=new int[n][n];
            for(int i=0;i<n;i++){
                ans[i][c]=1;
                ans[i][(c+1)%n]=4;
                c++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                   sb.append(ans[i][j]+" ");
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
    }
}
