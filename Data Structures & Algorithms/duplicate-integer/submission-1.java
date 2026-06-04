class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer, Integer> dup = new HashMap<>();

        for(int i : nums)
        {
            dup.put(i, dup.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : dup.entrySet())
        {
            if(entry.getValue() > 1)
            {
                return true;
            }
        }
        return false;
    }
}