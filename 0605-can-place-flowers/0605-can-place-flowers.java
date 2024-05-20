class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;

        for (int i=0; i<len; i++){
            if (flowerbed[i] == 0){
                boolean checkPrev = (i==0) || (flowerbed[i-1] == 0);
                boolean checkNext = (i==len-1) || (flowerbed[i+1] == 0);
                if (checkPrev && checkNext){
                    flowerbed[i] = 1;
                    count++;
                    i++;
                }
            }
        }
        return count >= n;
    }
}