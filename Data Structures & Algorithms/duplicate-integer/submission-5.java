class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Integer>sum = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            sum.put(nums[i] , sum.getOrDefault(nums[i] , 0)+1);
        }


        for(Map.Entry<Integer,Integer> entry : sum.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }

        return false;
        
    }
}