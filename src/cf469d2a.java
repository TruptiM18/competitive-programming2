import java.util.*;

public class cf469d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> set=new HashSet<>();
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            set.add(sc.nextInt());
        }
        int y=sc.nextInt();
        for(int i=0;i<y;i++){
            set.add(sc.nextInt());
        }
        if(set.size()==n){
            System.out.print("I become the guy.\n");
        }
        else{
            System.out.print("Oh, my keyboard!\n");
        }
    }
}
