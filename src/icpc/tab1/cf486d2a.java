package icpc.tab1;
import java.util.*;
public class cf486d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long odds=(long)Math.ceil(((double)n)/2);
        long evens=n-odds;
        long so=(1+(odds-1))*odds;
        long se=0;
        if(evens>0) {
            se=(2+(evens - 1))*evens ;
        }
        System.out.print((se-so)+"\n");
    }
}
