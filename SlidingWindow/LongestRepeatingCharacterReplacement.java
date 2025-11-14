package SlidingWindow;
//424. Longest Repeating Character Replacement
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left=0,right=0,maxFreq=0,maxLen=0;
        for(right=0;right<s.length();right++){
            char c = s.charAt(right);
            freq[c-'A']++;
            maxFreq=Math.max(maxFreq,freq[c-'A']);

            // If replacements needed > k, shrink window
            //right-left+1 represents window size
            while(((right-left+1)-maxFreq)>k){
                freq[s.charAt(left)-'A']--;
                left++;

            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
