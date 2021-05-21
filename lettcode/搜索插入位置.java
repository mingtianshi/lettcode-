//https://leetcode-cn.com/leetbook/read/array-and-string/cxqdh/
//搜索插入位置
class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=nums.length;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                a=i;
                return a;
            }else if(target<nums[i]){
                a=i;
                return a;
            }
        }
        return a;
    }
}