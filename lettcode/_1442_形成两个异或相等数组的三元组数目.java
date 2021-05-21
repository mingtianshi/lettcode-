//https://leetcode-cn.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
//_1442_形成两个异或相等数组的三元组数目
class Solution {
    public int countTriplets(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length - 1; i++){
            int sum = 0;
            for(int k = i; k < arr.length; k++){
                sum ^= arr[k];
                if(sum == 0 && k > i){
                    ans += (k - i);
                }
            }
        }
        return ans;
    }
}