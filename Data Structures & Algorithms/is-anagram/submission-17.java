class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;  // Check BEFORE converting to arrays, not equal length = def not an anagram
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArrayS.length; i++){
            map.put(charArrayS[i], map.getOrDefault(charArrayS[i], 0) + 1);
        }
        for (int i = 0; i < charArrayT.length;i++){
            if (map.containsKey(charArrayT[i]) == false || map.get(charArrayT[i]) == 0) return false;
            map.put(charArrayT[i], map.get(charArrayT[i]) - 1);
        }
        
        return true;
    }
}