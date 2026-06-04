class Solution {
    public int characterReplacement(String s, int k) {
        

        Map<Character, Integer>frq = new HashMap<>();
       
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++)
        {
            char ch = s.charAt(right);

            frq.put(ch, frq.getOrDefault(ch,0)+1);

            maxFreq = Math.max(maxFreq, frq.get(ch));

            while((right - left +1) - maxFreq > k)
            {
                char leftCh = s.charAt(left);
                frq.put(leftCh,frq.get(leftCh)-1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
