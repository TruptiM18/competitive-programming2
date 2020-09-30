package leetcode;

import java.util.HashMap;
import java.util.Map;

//30.09.2020
//Easy
public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
//Time Complexity=O(n)
//Space Complexity=n+n=2n=O(n)
