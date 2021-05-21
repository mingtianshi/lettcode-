#include <stdio.h>
#include <stdlib.h>
//26. 删除有序数组中的重复项
//链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/?discussion=hpUNXD
/**int removeDuplicates(int* nums, int numsSize){
    int j = numsSize;
    if(j > 1){
        j = 1;
        for(int i = 1; i < numsSize; i ++){
            if(nums[i] == nums[i - 1]){
                continue;
            } else{
                nums[j] = nums[i];
                j++;
            }
        }
    }
    return j;
}*/
/*
输入
[1,1,2]
输出
[1,2]
预期结果
[1,2]*/
int removeDuplicates(int* nums,int numsSize)
{int j = numsSize;
j=1;
for(int i=1;i<numsSize;i++){
	if(nums[i] == nums[i - 1]){
                continue;
            } else{
                nums[j] = nums[i];
                j++;
            }
        }
	return j;
}