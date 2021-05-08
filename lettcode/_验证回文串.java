//https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xne8id/
//验证回文串
public boolean isPalindrome(String s) {
    if (s == null || s.length() == 0)
        return true;

    s = s.toLowerCase();
    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
        while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
            i++;
        while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
            j--;
        if (s.charAt(i) != s.charAt(j))
            return false;
    }
    return true;
}
