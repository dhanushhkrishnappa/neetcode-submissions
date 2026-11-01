
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();

        for(char str : s.toCharArray()){
            map1.put(str, map1.getOrDefault(str, 0)+1);
        }
        
        for(char str : t.toCharArray()){
            map2.put(str, map2.getOrDefault(str, 0)+1);
        }

        if(map1.equals(map2)){
            return true;
        }
        
        return false;

    }
}
