package leetcode;

import java.util.*;
public class leetcode5454 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int curr=map.getOrDefault(arr[i],0);
            map.put(arr[i],curr+1);
        }
        List<Integer> freq=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            freq.add(entry.getValue());
        }
        Collections.sort(freq);
        int count=k;
        int uniq=freq.size();
        for(int i=0;i<freq.size();i++){
            if(freq.get(i)<=count){
                count=count-freq.get(i);
                uniq--;
            }
            else{
                count=0;
                break;
            }
        }
        return uniq;
    }
}
