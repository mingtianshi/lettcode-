//https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnmav1/
//最长公共前缀
public class _最长公共前缀 {
    public static void main(String[] args) {
        //TEST ["flower","flow","flight"]
        args = new String[]{"flower","flow","flight"};
        _最长公共前缀 ane = new _最长公共前缀();
        System.out.println(new Solution().longestCommonPrefix(args));
    }
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length == 0 ||strs ==  null){
                return "";
            }
            //默认第一个字符串是他们的公共前缀
            String pre = strs[0];
            for(int i = 1 ; i < strs.length; i++){
                while (strs[i].indexOf(pre) != 0)
                    pre = pre.substring(0, pre.length() - 1);
            }
            return pre;
        }
    }
}