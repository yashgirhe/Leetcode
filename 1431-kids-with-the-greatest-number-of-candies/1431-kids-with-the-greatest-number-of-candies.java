class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i=0; i<candies.length; i++){
            if (candies[i] > max){
                max = candies[i];
            }
        }
        ArrayList<Boolean> res= new ArrayList<>();
        for (int i=0; i<candies.length; i++){
            if ((candies[i] + extraCandies) >= max){
                res.add(true);
            }
            else {
                res.add(false);
            }
        }
        return res;
    }
}