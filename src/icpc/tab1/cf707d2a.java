package icpc.tab1;
import java.util.*;

public class cf707d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean isColorful=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                String pixel=sc.next();
                if(pixel.equals("C") || pixel.equals("M") || pixel.equals("Y")){
                    isColorful=true;
                    break;
                }
            }
            if(isColorful)  break;
        }
        if(isColorful) {
            System.out.print("#Color\n");
        }else{
            System.out.print("#Black&White\n");
        }
    }
}
