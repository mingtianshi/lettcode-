//https://leetcode-cn.com/problems/xor-queries-of-a-subarray/submissions/
//_1310_子数组异或查询
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xors = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            xors[i + 1] = xors[i] ^ arr[i];
        }
        
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = xors[queries[i][0]] ^ xors[queries[i][1] + 1];
        }
        return ans;
    }
}