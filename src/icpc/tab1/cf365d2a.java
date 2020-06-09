package icpc.tab1;

import java.util.*;
public class cf365d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=0;

        for(int i=0;i<n;i++){
            String a=sc.next();
            boolean [] arr=new boolean[10];
            for(int j=0;j<a.length();j++){
                arr[a.charAt(j)-'0']=true;
            }
            boolean isGood=true;
            for(int p=0;p<=k;p++){
                if(!arr[p]){
                    isGood=false;
                    break;
                }
            }
            if(isGood)  ans++;
        }

        System.out.print(ans+"\n");
    }
}
