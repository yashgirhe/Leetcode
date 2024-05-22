class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int value = hm.getOrDefault(nums[i],0);
            hm.put(nums[i],value+1);
        }
        for(Map.Entry<Integer,Integer> it : hm.entrySet()){
            if(it.getValue() >= 2){
                return true;
            }
        }
        return false;
    }
}