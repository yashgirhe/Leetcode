class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int diff = 0;
        for(int i=0; i<nums.length; i++){
            diff = target-nums[i];
            if(!hm.containsKey(diff)){
                hm.put(nums[i],i);
            }
            else{
                return new int[]{i,hm.get(diff)};
            }
        }
        return new int[0];
    }
}