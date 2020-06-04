package icpc.tab1;

import java.util.Scanner;

public class cf136d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        int j=1;
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            arr[x]=j;
            j++;
        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }

}
