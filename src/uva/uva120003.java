package uva;/*
UVa - PROBLEM ID 120003 - Array Transformer
solution approach inspired by comment of Xello on this CF discussion - https://codeforces.com/blog/entry/13204
Square root decomposition for N and M both
Time complexity = (N+M)*sqrt(M)
 */
import java.lang.*;
import java.util.*;
import java.io.*;
class Pair{
    public int val;
    public int idx;
    public Pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
}
class SortPair implements Comparator<Pair> {
    public int compare(Pair a, Pair b) {
        return a.val - b.val;
    }
}
class uva120003{
    public static void main(String [] args){
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int m=fs.nextInt();
        int u=fs.nextInt();
        int SIZE=550;
        int SIZEM=225;
        Pair [][] segments=new Pair [SIZE][SIZE];
        int[] arr=new int[n];
        int i, j, x, y;
        for (i = 0, j = (n-1)/SIZE; i < SIZE; i++) {
            segments[j][i] = new Pair(Integer.MAX_VALUE, -1);
        }
        for (i = 0; i < n; i++) {
            arr[i]=fs.nextInt();
            segments[i / SIZE][i % SIZE] = new Pair(arr[i], i);
        }
        for (i = (n - 1) / SIZE; i >= 0; i--)
            Arrays.sort(segments[i], new SortPair());
        int q=0;
        while(q<m){
            List<List<Integer>> batch=new ArrayList<>();
            List<List<Integer>> obatch=new ArrayList<>();
            int cm=q;
            for(int jcl=0;cm<m && jcl<SIZEM;jcl++){
                List<Integer> t=new ArrayList<>();
                t.add(fs.nextInt()-1); t.add(fs.nextInt()-1);
                t.add(fs.nextInt()); t.add(fs.nextInt()-1);
                t.add(jcl);
                batch.add(t);
                obatch.add(t);
                cm++;
            }
            batch.sort(Comparator.comparingInt(q2 -> q2.get(2)));
            int [] pt=new int[SIZE];
            int [] ans=new int[batch.size()];
            for(int b=0;b<batch.size();b++){
                int l=batch.get(b).get(0);
                int r=batch.get(b).get(1);
                int v=batch.get(b).get(2);
                int p=batch.get(b).get(3);
                int cnt=0;
                while(l<=r && l%SIZE!=0){
                    if(arr[l]<v) {
                        cnt++;
                    }
                    l++;
                }
                while(l<=r && (r+1)%SIZE!=0){
                    if(arr[r]<v){
                        cnt++;
                    }
                    r--;
                }
                if(l<=r) {
                    for (int s = l / SIZE; s <= r / SIZE; s++) {
                        cnt+=pt[s];
                        for (int it = pt[s]; it < SIZE; it++) {
                            if (segments[s][it].val < v) {
                                cnt++;
                            } else {
                                pt[s] = it;
                                break;
                            }
                        }
                    }
                }
                ans[batch.get(b).get(4)]=cnt;
            }
            for(int bx=0;bx<obatch.size();bx++){
                int lx=obatch.get(bx).get(0);
                int rx=obatch.get(bx).get(1);
                int vx=obatch.get(bx).get(2);
                int px=obatch.get(bx).get(3);
                int newval=(int)(((long)u * ans[bx])/(rx-lx+1));
                for(int by=bx+1;by<obatch.size();by++){
                    int ly=obatch.get(by).get(0);
                    int ry=obatch.get(by).get(1);
                    int vy=obatch.get(by).get(2);
                    int py=obatch.get(by).get(3);
                    if(px>=ly && px<=ry && arr[px]<vy && newval>=vy){
                        ans[by]--;

                    }
                    else if(px>=ly && px<=ry && arr[px]>=vy && newval<vy){
                        ans[by]++;
                    }
                }
                x = px / SIZE;
                for (i = 0; i<SIZE && segments[x][i].idx != px ; i++) ;
                for (; i < SIZE - 1; i++) {
                    segments[x][i] = segments[x][i + 1];
                }
                for (i = SIZE - 2; i >= 0 && segments[x][i].val > newval; i--) {
                    segments[x][i + 1] = segments[x][i];
                }
                segments[x][i + 1] = new Pair(newval,px);
                arr[px] = newval;
            }
            q=cm;
        }
        StringBuilder sb=new StringBuilder();
        for (i=0;i<n;i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb.toString());
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