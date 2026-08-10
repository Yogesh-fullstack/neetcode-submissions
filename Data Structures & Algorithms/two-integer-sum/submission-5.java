class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer , Integer> sum = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];

            if(sum.containsKey(comp)){
                return new int[]{sum.get(comp) , i};
            }
            sum.put(nums[i] , i);
        }
        return new int [] {-1,-1};
        
    }
}
