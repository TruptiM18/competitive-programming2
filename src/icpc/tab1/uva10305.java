package icpc.tab1;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            if(n==0 && m==0)    break;
            ArrayList<Integer>[] graph = new ArrayList[n + 1];
            Arrays.fill(graph, new ArrayList<>());
            for (int i = 0; i < m; i++) {
                int x=fs.nextInt();
                int y=fs.nextInt();
                graph[x].add(y);
            }
            boolean[] visit = new boolean[n+1];
            List<Integer> ordering = new ArrayList<>();
            for(int i=1;i<=n;i++) {
                if(!visit[i]) {
                    topologicalSort(graph, visit, i, ordering);
                }
            }
            int i = ordering.size() - 1;
            for (; i >0 ; i--) {
                sb.append(ordering.get(i)).append(" ");
            }
            sb.append(ordering.get(0)).append("\n");
        }
        System.out.print(sb.toString());
    }
    static void topologicalSort(ArrayList<Integer> [] graph,boolean [] visit,int curr,List<Integer> ordering){
        if(visit[curr]) return;
        visit[curr]=true;
        ArrayList<Integer> kids=graph[curr];
        for(int i=0;i<kids.size();i++){
            if(!visit[kids.get(i)]){
                topologicalSort(graph,visit,kids.get(i),ordering);
            }
        }
        ordering.add(curr);
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
