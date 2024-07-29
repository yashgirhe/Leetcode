class Solution {
    public int[] finalPrices(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i=0; i< arr.length-1; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[j] <= arr[i]){
                    ans[i] = arr[i]-arr[j];
                    break;
                }
                else ans[i] = arr[i];
            }
        }
        ans[ans.length-1] = arr[arr.length-1];
        return ans;
    }
}