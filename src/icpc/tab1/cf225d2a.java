package icpc.tab1;

import java.util.*;
public class cf225d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int top=sc.nextInt();
        int bot=7-top;
        boolean unique=true;
        for(int i=0;i<n;i++){
            int f1=sc.nextInt();
            int f2=sc.nextInt();
            if(f1==bot || f1==top || f2==top||f2==bot){
                unique=false;
                break;
            }
        }
        if(unique){
            System.out.print("YES\n");
        }
        else{
            System.out.print("NO\n");
        }
    }
}
