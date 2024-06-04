class Solution {
    public int missingNumber(int[] nums) {
        int[] hashArr = new int[max(nums) + 1];
        for (int i = 0; i < nums.length; i++) {
            hashArr[nums[i]]++;
        }
        int i=0;
        for (i = 0; i < hashArr.length; i++) {
            if (hashArr[i] == 0) {
                return i;
            }
        }
        return i;
    }
    public static int max ( int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}