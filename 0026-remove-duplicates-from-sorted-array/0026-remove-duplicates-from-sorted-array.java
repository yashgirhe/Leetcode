class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        for (int r=1; r<nums.length; r++){
            if (nums[r] > nums[l]){
                nums[l+1] = nums[r];
                l++;
            }
        }
        return l+1;
    }
}