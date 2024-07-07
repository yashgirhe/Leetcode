class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[102];
        int[] res = new int[nums.length];
        //count freq
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        //update freq array to prefix sum
        for(int i=1; i<freq.length; i++){
            freq[i] += freq[i-1];
        }
        //fetch value for res array
        for(int i=0; i<res.length; i++){
            if(nums[i] == 0) res[i] = 0;
            else
            res[i] = freq[nums[i]-1];
        }
        return res;
    }
}