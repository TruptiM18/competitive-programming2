package icpc.tab1;
import java.util.Scanner;

public class cf584d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        StringBuilder ans=new StringBuilder();
        if(t==10){
            if(n==1){
                ans.append("-1");
            }
            else{
                for(int i=0;i<n-1;i++){
                    ans.append('1');
                }
                ans.append('0');
            }
        }
        else{
            for(int i=0;i<n;i++){
                ans.append(t);
            }
        }
        System.out.print(ans.toString()+"\n");
    }
}
