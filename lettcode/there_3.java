//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;
import java.util.Set;

public class there_3{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
    }
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int i = 0, j =0 , count = 0;
            Set<Character> set = new HashSet<>();
                while(i < s.length()){
                if(!set.contains(s.charAt(i))){
                    set.add(s.charAt(i++));
                    count = count > set.size() ? count : set.size();
                } else {
                    set.remove(s.charAt(j++));
                }
            }
            return count;
        }
    }
}