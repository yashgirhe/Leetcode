class Solution {
    public int largestAltitude(int[] gain) {
        int origin = 0;
        int maxAlt = 0;
        for (int i=0; i<gain.length; i++){
            origin += gain[i];
            if (origin > maxAlt){
                maxAlt = origin;
            }
        }
        return maxAlt;
    }
}