package leetcode;

//Hard
//01.10.2020
public class leetcode41 {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        if(n==0)    return 1;
        for(int i=0;i<n;){
            if(nums[i]!=i+1 && nums[i]>=1 && nums[i]<=n && nums[nums[i]-1]!=nums[i]){
                int tmp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=tmp;
            }
            else{
                i++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n;
    }
}
//Time Complexity=O(n)
//Space Complexity=O(1) extra space
