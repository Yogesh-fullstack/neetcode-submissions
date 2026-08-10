class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character , Integer> s1 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            s1.put(ch , s1.getOrDefault(ch,0)+1);
        }


        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(!s1.containsKey(ch) || s1.get(ch)== 0){
                return false;
            }
            s1.put(ch,s1.get(ch)-1);
        }
        return true;

    }
}
