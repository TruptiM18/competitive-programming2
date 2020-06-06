package icpc.tab1;
import java.util.*;
public class cf80d2a {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=0;j<list.size();j++){
                if(i%list.get(j)==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) list.add(i);
        }
        boolean nextPrimeFound=false;
        int i=n+1;
        while(!nextPrimeFound){
            boolean isPrime=true;
            for(int j=0;j<list.size();j++){
                if(i%list.get(j)==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                list.add(i);
                nextPrimeFound=true;
            }
            i++;
        }
        if(m==list.get(list.size()-1)){
            System.out.print("YES\n");
        }
        else{
            System.out.print("NO\n");
        }
    }
}
