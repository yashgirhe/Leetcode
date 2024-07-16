class Solution {
    int[] shuffle;
    int[] original;
    Random rand = new Random();

    public Solution(int[] nums) {
        original = nums.clone();
        shuffle = nums.clone();
    }
    
    public int[] reset() {
        return original;
        
    }
    
    public int[] shuffle() {
        for(int i=shuffle.length-1; i>=0; i--){
            int j = rand.nextInt(i+1);
            int temp = shuffle[j];
            shuffle[j] = shuffle[i];
            shuffle[i] = temp;
        }
        return shuffle;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */