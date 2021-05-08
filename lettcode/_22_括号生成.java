//https://leetcode-cn.com/problems/generate-parentheses/
//22. 括号生成
class Solution {
   List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if(n<=0){
            return res;
        }
        // 3
        getParenthesis("",n,n);
        return res;
    }
    public void getParenthesis(String str,int left, int right) {
            if(left == 0 && right == 0 ){
                res.add(str);
                return;
            }

            if(left == right){
                //剩余左右括号数相等，下一个只能用左括号
                getParenthesis(str+"(",left-1,right);
            }else if(left < right){
                //剩余左括号小于右括号，下一个可以用左括号也可以用右括号
                if(left > 0){
                    getParenthesis(str+"(",left-1,right);
                }
                getParenthesis(str+")",left,right-1);
            }
        }
}