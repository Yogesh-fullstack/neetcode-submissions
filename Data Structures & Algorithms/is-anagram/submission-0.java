class Solution {
    public boolean isAnagram(String s, String t) {

        //edge case
        if(s.length() != t.length())
        {
            return false;
        } 

        Map<Character, Integer> bingo = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            bingo.put(ch, bingo.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray())
        {
            if(!bingo.containsKey(ch))
            {
                return false;
            }
            bingo.put(ch, bingo.get(ch)-1);
            if(bingo.get(ch) == 0)
            {
                bingo.remove(ch);
            }
        }
        return bingo.isEmpty();
    }
}
