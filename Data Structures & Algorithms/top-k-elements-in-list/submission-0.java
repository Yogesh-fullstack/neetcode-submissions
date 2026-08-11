class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int s : nums){
            map.put(s, map.getOrDefault(s , 0)+1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }


        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int frerquency = entry.getValue();
            int number = entry.getKey();
            buckets[frerquency].add(number);
        }

        int [] result  = new int [k];
        int index = 0;

        for(int freq = nums.length; freq >= 0 && index <k; freq--)
        {
           for(int num : buckets[freq])
           {
            result[index] = num;
            index++;

            if(index == k)
            {
                break;
            }
           }
        }
        return result;


        
    }
}
