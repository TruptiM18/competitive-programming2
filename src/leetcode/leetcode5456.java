package leetcode;

import java.util.*;
public class leetcode5456 {
    class TreeAncestor {
        int [] parent;
        int n;
        List<List<Integer>> tree=new ArrayList<>(n);
        List<List<Integer>> dp=new ArrayList<>(n);
        List<Integer> level=new ArrayList<>(n);

        public void traverse(List<Integer> path,int curr){
            level.set(curr,path.size());
            for(int i=1;i<=path.size();i=i<<1){
                dp.get(curr).add(path.get(path.size()-i));
            }
            path.add(curr);

            for(int i=0;i<tree.get(curr).size();i++){
                traverse(path,tree.get(curr).get(i));
            }


            path.remove(path.size()-1);
        }
        public TreeAncestor(int n, int[] parent) {
            this.parent=parent;
            this.n=n;
            for(int i=0;i<parent.length;i++){
                tree.add(new ArrayList<>());
                dp.add(new ArrayList<>());
                level.add(1);
            }

            for(int i=1;i<parent.length;i++){
                tree.get(parent[i]).add(i);
            }
            List<Integer> path=new ArrayList<>();
            traverse(path,0);
        }

        public int getKthAncestor(int node, int k) {
            if(k==0) return node;
            if(level.get(node) < k) return -1;
            int h=1; int pos=0;
            while(h<<1 <= k){
                h=h<<1;
                pos++;
            }
            return getKthAncestor(dp.get(node).get(pos),k-h);
        }
    }

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */
}
