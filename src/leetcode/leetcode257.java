package leetcode;

import java.util.*;

//Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

class leetcode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        helper(root,"",ans);
        return ans;
    }
    public void helper(TreeNode root,String path,List<String> ans){
        if(root == null){
            return;
        }
        else if(root.left==null && root.right==null){
            String tpath=path+root.val;
            ans.add(tpath);
        }
        else{
            String tpath=path+root.val+"->";
            helper(root.left,tpath,ans);
            helper(root.right,tpath,ans);
        }
    }
}
