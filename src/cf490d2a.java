import java.util.ArrayList;
import java.util.Scanner;

public class cf490d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> talents=new ArrayList<>();
        for (int i=0;i<3;i++){
            talents.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            talents.get(t-1).add(i+1);
        }
        int minTeams=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            minTeams=Math.min(talents.get(i).size(),minTeams);
        }
        System.out.print(minTeams+"\n");
        for (int i=0;i<minTeams;i++){
            for (int j=0;j<3;j++){
                System.out.print(talents.get(j).get(i)+" ");
            }
            System.out.print("\n");
        }
    }
}
