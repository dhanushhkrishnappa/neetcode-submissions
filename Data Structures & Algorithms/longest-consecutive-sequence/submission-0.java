class Solution {
    public int longestConsecutive(int[] nums) {

        
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 1. Remove duplicates using HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // 2. Convert to ArrayList and sort it
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);

        // Track streaks
        int count = 1;
        int maxStreak = 1;

        // 3. Traverse sorted unique elements
        for (int i = 0; i < sorted.size() - 1; i++) {
            // Check if the next element is strictly consecutive
            if (sorted.get(i + 1) - sorted.get(i) == 1) {
                count++;
            } else {
                maxStreak = Math.max(maxStreak, count);
                count = 1; // Reset counter for the next sequence
            }
        }

        // 4. Final check to record the streak if it ended at the last element
        maxStreak = Math.max(maxStreak, count);

        return maxStreak;
        
    }
}
