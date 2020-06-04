package icpc.tab1;

import java.util.*;

public class cf216d2b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer>[] g=new ArrayList[n+1];
        int[] colors=new int[n+1];
        boolean [] players=new boolean[n+1];
        Arrays.fill(colors,-1);
        boolean [] visit=new boolean[n+1];
        for(int i=1;i<=m;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(g[x]==null) {
                g[x] = new ArrayList<>();
            }
            g[x].add(y);
            if(g[y]==null){
                g[y]=new ArrayList<>();
            }
            g[y].add(x);
        }
        for(int i=1;i<=n;i++){
            if(!visit[i]){
                dfs(i,g,colors,visit,1,players);
            }
        }
        int count=0;
        for(int i=0;i<=n;i++){
            if(players[i]){
                count++;
            }
        }
        if((n-count)%2==1){
            count++;
        }
        System.out.print(count+"\n");
    }
    static void dfs(int curr,ArrayList<Integer>[] g,int []colors,boolean [] visit,
                    int color,boolean [] players){
        if(visit[curr]) return;
        visit[curr]=true;
        colors[curr]=color;
        if(g[curr]==null)   return;
        List<Integer> children=g[curr];
        for(int i=0;i<children.size();i++){
            int c=children.get(i);
            int childrenColor= color==1? 0:1;
            if(!visit[c]) {
                dfs(c, g, colors, visit, childrenColor,players);
            }
            else{
                if(colors[c]==color && !(players[curr] || players[c])){
                    players[c]=true;
                }
            }
        }
    }
}
