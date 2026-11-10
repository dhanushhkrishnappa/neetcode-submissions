class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set()
        for num in nums:
            seen.add(num)

        arr = sorted(seen)
        count =1
        maxc= 1
        if not nums:
            return 0
        for i in range(len(arr)-1):
            if arr[i]+1 == arr[i+1]:
                count+=1
            else:
                maxc= max(count,maxc)
                count=1
        return max(maxc,count)
            
            

