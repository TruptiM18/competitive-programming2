package icpc.tab1;
import java.util.*;

public class cf43d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum1=1;
        int sum2=0;
        String team1=sc.next();
        String team2="";
        for(int i=1;i<n;i++){
            String winningTeam=sc.next();
            if(winningTeam.equals(team1)){
                sum1++;
            }
            else{
                team2=winningTeam;
                sum2++;
            }
        }
        if(sum1 > sum2)
        {
            System.out.print(team1+"\n");
        }
        else{
            System.out.print(team2+"\n");
        }
    }
}
