class Solution {
    public int missingNumber(int[] nums) {
        int actualSum=0,expectedSum=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=nums.length*(nums.length+1)/2;
            actualSum=actualSum+nums[i];
            expectedSum=sum-actualSum;
        }
    return expectedSum;
    }
}
