import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class cf339d2a {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9') {
                list.add(c);
            }
        }
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size()-1;i++){
            sb.append(list.get(i)+"+");
        }
        sb.append(list.get(list.size()-1));
        System.out.print(sb.toString()+"\n");
    }
}
