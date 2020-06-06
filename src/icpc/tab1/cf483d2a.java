package icpc.tab1;

import java.util.Scanner;

public class cf483d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long r=sc.nextLong();
        String ans="-1\n";
        while(l<=r){
            if(l%2!=0){
                l++;
            }
            else if(l+2>r){
                break;
            }
            else{
                ans=l+" "+(l+1)+" "+(l+2)+"\n";
                break;
            }
        }
        System.out.print(ans);
    }
}
