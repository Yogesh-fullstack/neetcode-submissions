class Solution {
    public boolean isAnagram(String s, String t) {
       
       if(s.length() != t.length())
       {
        return false;
       }
       Map<Character, Integer> map = new HashMap<>();

       for(int i = 0; i < s.length(); i++)
       {
           char ch1 = s.charAt(i);
           map.put(ch1, map.getOrDefault(ch1,0)+1);
       }

       for(int j = 0; j < t.length(); j++)
       {
         char ch2 = t.charAt(j);
         if(!map.containsKey(ch2))
         {
            return false;
         }
         map.put(ch2, map.get(ch2)-1);

         if(map.get(ch2) == 0)
         {
            map.remove(ch2);
         }
       }
       return map.isEmpty();
    }
}
