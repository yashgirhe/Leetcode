class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int rotation = k%len;
        if (rotation > 0){
            int[] temp = new int[rotation];
            int j = 0;
            //store in temp
            for (int i = len - rotation; i < len; i++) {
                temp[j] = nums[i];
                j++;
            }
            //shift
            for (int i = len - rotation - 1; i >= 0; i--) {
                nums[i + rotation] = nums[i];
            }
            //place in front
            for (int i = 0; i < temp.length; i++) {
                nums[i] = temp[i];
            }
        }
    }
}