import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;
        int n = s.length();
        int maxLen = 0;
        // store last index + 1 of each character (so default 0 means not seen)
        int[] last = new int[256]; // if unicode needed, use HashMap<Character,Integer>
        int i = 0; // window start
        for (int j = 0; j < n; j++) {
            char c = s.charAt(j);
            // move start to max(current start, last occurrence + 1)
            i = Math.max(i, last[c]);
            maxLen = Math.max(maxLen, j - i + 1);
            // store index+1
            last[c] = j + 1;
        }
        return maxLen;
    }

    // quick tests
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(sol.lengthOfLongestSubstring(""));         // 0
    }
}

