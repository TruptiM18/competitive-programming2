package leetcode;
import java.util.*;

//30.09.2020
//Medium
public class leetcode139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] isBreak=new boolean[n];
        HashSet dict=new HashSet(wordDict);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j-1<0 || isBreak[j-1]){
                    String substr=s.substring(j,i+1); //Time Complexity of substring function=O(n);
                    if(dict.contains(substr)){
                        dict.add(substr);
                        isBreak[i]=true;
                        break;
                    }
                }
            }
        }
        return isBreak[n-1];
    }
}
//worst case : s=abcd wordDict=["a","b","c","d"]
//Time Complexity=O(n^3)
//worst case : s=abcd wordDict=["a","ab","abc","abcd","b","bc","bcd","cd","d"]
//Space Complexity=O(m+n^2) where m=length of words in dict
