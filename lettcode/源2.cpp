#include <stdio.h>
/**
https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/

*/

int removeDuplicates(int* nums, int numsSize){
    if (numsSize <= 1) {
        return numsSize;
    }

    int i = 0,j = 1;
    while (i+1 <= numsSize) {
        if (nums[i] != nums[j-1]) {
            nums[j] = nums[i];
            j ++;
        }
        i++;
    }
    return j;
}