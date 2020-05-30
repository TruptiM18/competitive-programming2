import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cd474d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d= sc.next().equals("R")? -1 : 1;
        String keyboard="qwertyuiopasdfghjkl;zxcvbnm,./";
        Map<Character,Integer> map=new HashMap<>();
        String msg=sc.next();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<keyboard.length();i++){
            map.put(keyboard.charAt(i),i);
        }
        for(char c:msg.toCharArray()){
            int idx=map.get(c)+d;
            ans.append(keyboard.charAt(idx));
        }
        System.out.print(ans.toString()+"\n");
    }
}
