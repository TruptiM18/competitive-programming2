import java.util.Scanner;

public class cf71d2a {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            String t=scanner.next();
            if(t.length()>10) {
                System.out.print(t.charAt(0) +""+ (t.length() - 2) + ""+t.charAt(t.length() - 1) + "\n");
            }
            else{
                System.out.print(t+"\n");
            }
        }
    }
}
