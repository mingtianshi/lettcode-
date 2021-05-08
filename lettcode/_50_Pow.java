//https://leetcode-cn.com/problems/powx-n/submissions/
//_50_Pow
class Solution {
    public double myPow(double x, int n) {
        if(x==1) return 1;
        if(x==0) return 0;
        if(n==0) return 1;
        if(n==Integer.MIN_VALUE) return 1/myPow(x,Integer.MAX_VALUE)*x;
        if(n<0) return 1/myPow(x,-n);
        double a = x;
        double ans = 1;
        while(n>0){
            if((n&1)==1) ans *= a;
            n = n>>1;
            a = a*a;
        }
        return ans;
    }
}