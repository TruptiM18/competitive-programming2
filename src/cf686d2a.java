import java.util.Scanner;

public class cf686d2a {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long x=sc.nextLong();
        int children=0;
        for(int i=0;i<n;i++){
            String sign=sc.next();
            int d=sc.nextInt();
            if(sign.equals("-")){
                if(x >= d)
                    x-=d;
                else
                    children++;
            }
            else if(sign.equals("+")){
                x+=d;
            }
        }
        System.out.print(x+" "+children+"\n");
    }
}
