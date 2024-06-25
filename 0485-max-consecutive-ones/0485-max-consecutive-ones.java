class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int maxLen = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 1) {
                maxLen = Math.max(maxLen, r - l + 1);
            } else {
                l = r + 1;
            }
        }
        return maxLen;
    }
}