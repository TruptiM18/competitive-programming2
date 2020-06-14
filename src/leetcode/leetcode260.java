package leetcode;

public class leetcode260 {
    public int[] singleNumber(int[] nums) {
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int mask=1;
        while((mask&xor) == 0){
            mask=mask<<1;
        }
        int xor1=-1;
        int xor0=-1;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&mask)!=0){
                if(xor1==-1){
                    xor1=nums[i];
                }
                else{
                    xor1=xor1^nums[i];
                }
            }
            else{
                if(xor0==-1){
                    xor0=nums[i];
                }
                else{
                    xor0=xor0^nums[i];
                }

            }
        }
        int [] ans=new int[2];
        ans[0]=xor0;
        ans[1]=xor1;
        return ans;
    }
}
