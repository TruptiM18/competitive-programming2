import java.util.Scanner;

public class cf770d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String ans=""; int it=0;
        for(int i=0;i<n;i++){
            ans+=(char)('a'+ (it%k));
            it++;
        }
        System.out.print(ans+"\n");
    }
}
