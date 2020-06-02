import java.io.*;
import java.util.*;

public class spojMakeTree {
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        StringBuilder sb=new StringBuilder();
        int N=fs.nextInt();
        int K=fs.nextInt();
        int [] parent=new int[N+1];
        List<List<Integer>> g=new ArrayList<>();
        for(int i=1;i<=K;i++){
            int children=fs.nextInt();
            List<Integer> tmp=new ArrayList<>();
            for(int j=0;j<children;j++){
                tmp.add(fs.nextInt());
            }
            g.add(tmp);
        }
        boolean [] visited=new boolean[N+1];
        List<Integer> q=new ArrayList<>();
        for(int i=0;i<K;i++) {
            topologicalSort(g, K, q, visited, i+1);
        }
        for(int i=0;i<q.size()-1;i++){
            parent[q.get(i)]=q.get(i+1);
        }
        int root=0;
        for(int i=1;i<=K;i++){
            if(parent[i]==root){
                root=i;
                break;
            }
        }
        for(int i=1;i<=N;i++){
            if(i!=root && parent[i]==0)
                parent[i]=root;
            sb.append(parent[i]).append("\n");
        }
        System.out.print(sb.toString());
    }
    static void topologicalSort(List<List<Integer>> g,int K,List<Integer> q,boolean [] visited,int root){
        if(visited[root])   return;
        visited[root]=true;
        if(root>K) {
            q.add(root);
            return;
        }
        List<Integer> tmp=g.get(root-1);
        for(int j=0;j<tmp.size();j++){
            int c=tmp.get(j);
            if(!visited[c]){
                topologicalSort(g,K,q,visited,c);
            }
        }
        q.add(root);
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
