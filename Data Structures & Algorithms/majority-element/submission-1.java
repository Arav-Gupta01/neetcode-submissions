class Solution {
    public int majorityElement(int[] nums) {
        java.util.HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int oldCount=map.getOrDefault(nums[i],0);
            int newCount=oldCount+1;
            map.put(nums[i],newCount);
            if(newCount>nums.length/2)
            {
                return nums[i];
            }
        }
    return -1;
    }
}