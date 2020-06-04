package icpc.tab1;

import java.util.*;

public class cf785d2a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=0;
        Map<String,Integer> map=new HashMap<>();
        map.put("Tetrahedron",4);
        map.put("Cube",6);
        map.put("Octahedron",8);
        map.put("Dodecahedron",12);
        map.put("Icosahedron",20);
        for(int i=0;i<n;i++){
            ans+=map.get(sc.next());
        }
        System.out.print(ans+"\n");
    }
}
