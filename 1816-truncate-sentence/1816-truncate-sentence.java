class Solution {
    public String truncateSentence(String s, int k) {
        int space_count = 0;
        int i=0;
        while (i<s.length()){
            if (s.charAt(i) == ' ') space_count++;
            if (space_count == k) break;
            i++;
        }
        return s.substring(0,i);
    }
}