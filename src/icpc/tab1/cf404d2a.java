package icpc.tab1;

import java.util.Scanner;

public class cf404d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] paper=new String[n];
        boolean[][]v=new boolean[n][n];
        boolean isX=true;
        for(int i=0;i<n;i++){
            paper[i]=sc.next();
        }
        if(paper[0].charAt(0) == paper[0].charAt(1)){
            isX=false;
        }
        int i=0,j=0;
        char d=paper[i].charAt(j);
        while(i<n && j<n){
            v[i][j]=true;
            if(paper[i].charAt(j)!=d){
                isX=false;
                break;
            }
            i++;j++;
        }
        i=0; j=n-1;
        while(i<n && j>=0){
            v[i][j]=true;
            if(paper[i].charAt(j)!=d){
                isX=false;
                break;
            }
            i++;j--;
        }
        i=0;j=1;
        d=paper[i].charAt(j);
        for(;i<n;i++){
            for(;j<n;j++){
                if(!v[i][j] && paper[i].charAt(j)!=d){
                    isX=false;
                    break;
                }
            }
            j=0;
        }
        if(isX){
            System.out.print("YES\n");
        }
        else{
            System.out.print("NO\n");
        }
    }
}
