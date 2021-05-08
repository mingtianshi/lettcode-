//https://leetcode-cn.com/problems/replace-all-digits-with-characters/
//5730. 将所有数字用字符替换
class Solution {
public:
    string replaceDigits(string s) {
        for (int i = 0; i < s.size(); i += 2)
            if (i + 1 < s.size())
                s[i + 1] += s[i] - '0';
        return s;
    }
};


class Solution {
        public String replaceDigits(String s) {
            char[] a = s.toCharArray();
            for(int i = 1; i < s.length(); i += 2)
                //偶数
                //字符串 - 数字 + 数字
                a[i] = (char)(a[i - 1] + a[i] - '0');
            return new String(a);
            //a[1]
            // a[1] = (char)('s' + '1' - '0');
            // a[3] = (char)('s' + '1' - '0');
            // a[5] = (char)('s' + '2' - '0');
            
            //a[3]

        }
}