class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] newArray = new int[nums.length];
        int even = 0;
        int odd = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                newArray[even] = nums[i];
                even +=2;
            }
            else{
                newArray[odd] = nums[i];
                odd +=2;
            }
        }
        return newArray;
    }
}