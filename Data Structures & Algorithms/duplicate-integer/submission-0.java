class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> uni = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            uni.put(nums[i] , uni.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : uni.entrySet())
        {
            if(entry.getValue() > 1)
            {
                return true;
            }
        }
        return false;
    }
}