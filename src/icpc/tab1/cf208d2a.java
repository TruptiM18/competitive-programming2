package icpc.tab1;

import java.util.Scanner;

public class cf208d2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        s=s.replaceAll("(WUB)+"," ");
        s=s.trim();
        System.out.print(s+"\n");
    }
}
