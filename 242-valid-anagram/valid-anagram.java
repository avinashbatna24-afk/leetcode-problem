class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> m = new HashMap<>();
        HashMap<Character,Integer> n = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0;i<s.length();i++){
            n.put(t.charAt(i),n.getOrDefault(t.charAt(i),0)+1);
        }
        if(m.equals(n)) return true;
        return false;
    }
}