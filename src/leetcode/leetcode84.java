package leetcode;

import java.util.*;

class leetcode84 {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        if(n==0)    return 0;
        else if(n==1)   return heights[0];
        int [] li=new int[n];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<n;i++){
            if(stk.empty()){
                li[i]=-1;
            }
            else if(heights[stk.peek()]<heights[i]){
                li[i]=stk.peek();
            }
            else{
                while(!stk.empty() && heights[stk.peek()]>=heights[i]){
                    stk.pop();
                }
                if(stk.empty()) li[i]=-1;
                else    li[i]=stk.peek();
            }
            stk.push(i);
        }
        stk=new Stack<>();
        int [] ri=new int[n];
        for(int i=n-1;i>=0;i--){
            if(stk.empty()){
                ri[i]=n;
            }
            else if(heights[stk.peek()]<heights[i]){
                ri[i]=stk.peek();
            }
            else{
                while(!stk.empty() && heights[stk.peek()]>=heights[i]){
                    stk.pop();
                }
                if(stk.empty()) ri[i]=n;
                else    ri[i]=stk.peek();
            }
            stk.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,(ri[i]-li[i]-1)*heights[i]);
        }
        return ans;
    }
}