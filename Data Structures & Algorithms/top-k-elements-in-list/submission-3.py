class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        mp = {}
        for num in nums:
            if num in mp:
                mp[num]+=1
            else:
                mp[num]=1
        
        sortedmp = sorted(mp.items(), key = lambda x:x[1], reverse= True)
        result = []
        for key,value in sortedmp[:k]:
            result.append(key)

        return result

        