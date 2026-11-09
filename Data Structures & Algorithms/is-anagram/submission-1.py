class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        freq = {}
        
        for char in s :
            if char in freq:
                freq[char] += 1
            else:
                freq[char] = 1
        freq2={}
        for char in t:
            if char in freq2:
                freq2[char] += 1
            else :
                freq2[char] = 1
        
        if freq == freq2 :
            return True
        
        return False


        