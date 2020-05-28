import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class cf520d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z')
                set.add(c);
            else
                set.add((char)(c-'A'+'a'));
            if(set.size()==26)    break;
        }
        if(set.size()==26){
            System.out.print("YES\n");
        }
        else{
            System.out.print("NO\n");
        }
    }
}
