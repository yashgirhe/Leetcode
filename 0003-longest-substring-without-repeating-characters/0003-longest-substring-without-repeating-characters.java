class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxLen =0;
        int l = 0;
        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            if(hm.containsKey(c)){
                l = Math.max(l,hm.get(c)+1);
            }
            hm.put(s.charAt(r),r);
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}