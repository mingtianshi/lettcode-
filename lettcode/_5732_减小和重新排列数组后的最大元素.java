//https://leetcode-cn.com/problems/maximum-element-after-decreasing-and-rearranging/
//5732. 减小和重新排列数组后的最大元素
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        if(arr.length == 0) return 0;
        Arrays.sort(arr);
        if(arr[0] != 1){
            arr[0] = 1;
        }
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] - arr[i-1]>1){
                arr[i]=arr[i-1]+1;
            }
        }
        return arr[arr.length - 1];
    }
}