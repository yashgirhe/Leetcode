class Solution {
    public void nextPermutation(int[] nums) {
        //find dip(break point from last)
        int n = nums.length;
        int breakPoint = -1;
        for (int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                breakPoint = i;
                break;
            }
        }
        //if break point doesn't exist
        if(breakPoint == -1){
            reverse(nums,0,n-1);
            return;
        }
        //find element slightly greater than BP
        int toSwap = 0;
        for (int i=n-1; i> breakPoint; i--){
            if(nums[i] > nums[breakPoint]){
                toSwap = i;
                break;
            }
        }
        //swap
        int temp = nums[breakPoint];
        nums[breakPoint] = nums[toSwap];
        nums[toSwap] = temp;
        //reverse remaining
        reverse(nums,breakPoint+1,n-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums,int start, int end){
        int l = start;
        int r = end;
        while(l<=r){
            int temp2 = nums[l];
            nums[l] = nums[r];
            nums[r] = temp2;
            l++;
            r--;
        }
    }
}