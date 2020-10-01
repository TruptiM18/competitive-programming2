package leetcode;

//713. Subarray Product Less Than K
//Medium
public class leetcode713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        if(n==0)    return 0;
        int i=0,product=1,ans=0;
        for(int j=0;j<n;j++){
            product*=nums[j];
            while(i<=j && product>=k){
                ans+=j-i;
                product/=nums[i];
                i++;
            }
        }
        while(i<n){
            ans+=n-i;
            i++;
        }
        return ans;
    }
}
//Time Complexity=O(n)
//Space Complexity=O(1) extra space
