package icpc.tab1;
import java.util.*;
public class cf801d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] b=new int[n];
        int [] a=new int[n];
        Integer [] b1=new Integer[n];
        int rated=0;
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
            a[i]=sc.nextInt();
            b1[i]=b[i];
            if(b[i]!=a[i]){
                rated=1;
                break;
            }
        }
        if(rated!=1){
            Arrays.sort(b1,Collections.reverseOrder());
            for(int i=0;i<n;i++){
                if(b[i]!=b1[i]){
                    rated=-1;
                    break;
                }
            }
        }
        if(rated==1){
            System.out.print("rated\n");
        }
        else if (rated==0){
            System.out.print("maybe\n");
        }
        else{
            System.out.print("unrated\n");
        }
    }
}
