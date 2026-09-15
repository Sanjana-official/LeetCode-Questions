class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // Convert List to array for easier access
        int[] numsArr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++)
            numsArr[i] = nums.get(i);

        int count = 0;

        // Check all pairs (i, j) where i < j
        for (int i = 0; i < numsArr.length; i++) {
            for (int j = i + 1; j < numsArr.length; j++) {
                // If sum of pair is less than target, count it
                if (numsArr[i] + numsArr[j] < target) {
                    count++;
                }
            }
        }

        return count;
    }
}
