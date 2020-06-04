package icpc.tab1;

import java.lang.*;
import java.util.*;

public class cf443d2a {
    public static void main(String [] args){
        Set<Character> set=new HashSet<>();
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        for(int i=0;i<=1000;i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z')
                set.add(c);
            else if(c=='}')
                break;
        }
        System.out.println(set.size());
    }
}
