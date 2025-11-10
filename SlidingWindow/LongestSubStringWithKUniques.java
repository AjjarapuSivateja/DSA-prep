package SlidingWindow;

import java.util.HashMap;

public class LongestSubStringWithKUniques {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> f =new HashMap<>();
        int left=0;
        int n = s.length();
        int maxLen=-1;
        for(int right=0;right<n;right++){
            char c = s.charAt(right);
            f.put(c,f.getOrDefault(c,0)+1);
            while(f.size()>k){
                char leftChar = s.charAt(left);
                f.put(leftChar,f.get(leftChar)-1);
                if(f.get(leftChar)==0){
                    f.remove(leftChar);
                }
                left++;

            }
            if(f.size()==k){
                maxLen=Math.max(maxLen,right-left+1);
            }

        }
        return maxLen;
    }
}
