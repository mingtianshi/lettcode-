//https://leetcode-cn.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/submissions/
//_1269_停在原地的方案数
class Solution {
    int mod = (int)1e9+7;
    //强制转换int
    public int numWays(int steps, int len) {
        int max = Math.min(steps / 2, len - 1);
        int[][] f = new int[steps + 1][max + 1]; 
        f[steps][0] = 1;
//由「原地」操作到达当前状态，消耗一次操作，此时由状态 f[i + 1][j]f[i+1][j] 转移而来
//由「向左」操作到达当前状态，消耗一次操作，此时由状态 f[i + 1][j + 1]f[i+1][j+1] 转移而来
//由「向右」操作到达当前状态，消耗一次操作，此时由状态 f[i + 1][j - 1]f[i+1][j−1] 转移而来。
        for (int i = steps - 1; i >= 0; i--) {
            for (int j = 0; j <= max; j++) {
                f[i][j] = (f[i][j] + f[i + 1][j]) % mod;
                if (j - 1 >= 0) f[i][j] = (f[i][j] + f[i + 1][j - 1]) % mod;
                if (j + 1 <= max) f[i][j] = (f[i][j] + f[i + 1][j + 1]) % mod;
            }
        }
//起始位置为 00，操作次数为 stepstep，即有初始化条件 f[step][0] = 1f[step][0]=1，f[0][0]f[0][0] 则是我们的最终答案
        return f[0][0];
    }
}