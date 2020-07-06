package leetcode;

//KMP algo
public class leetcode28 {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)  return 0;
        return KMP(haystack.toCharArray(),needle.toCharArray());
    }
    public int [] lps(char[] s){
        int n=s.length;
        int [] lps=new int[n];
        int j=0;
        lps[0]=0;
        for(int i=1;i<s.length;i++){
            if(s[j]==s[i]){
                lps[i]=j+1;
                j++;
            }
            else{
                while(j!=0 && s[i]!=s[j]){
                    j=lps[j-1];
                }
                if(s[i]==s[j]){
                    lps[i]=j+1;
                    j++;
                }
                else{
                    lps[i]=0;
                }
            }
        }
        return lps;
    }
    public int KMP(char[] text,char [] pattern){
        int [] lps=lps(pattern);
        int i=0,j=0;
        while(i<text.length && j<pattern.length){
            if(text[i]==pattern[j]){
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        if(j==pattern.length)	return i-pattern.length;
        return -1;
    }
}
