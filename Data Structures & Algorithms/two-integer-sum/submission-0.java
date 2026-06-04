class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> sum = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int acc = target - nums[i];
            if(sum.containsKey(acc))
            {
                return new int[]{sum.get(acc), i};
            }

            sum.put(nums[i],i);
        }
        return new int[]{};
    }
}
