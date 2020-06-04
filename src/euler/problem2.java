package euler;

public class problem2 {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        int ans=2;
        while(x+y <=4000000){
            int sum=x+y;
            if((x+y)%2==0){
                ans+=sum;
            }
            x=y;
            y=sum;
        }
        System.out.print(ans+"\n");
    }
}
