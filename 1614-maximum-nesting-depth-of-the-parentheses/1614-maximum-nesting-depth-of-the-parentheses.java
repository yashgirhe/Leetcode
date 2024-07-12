class Solution {
    public int maxDepth(String s) {
        int count=0,max = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') count++;
            else if(c == ')') count--;
            max = Math.max(max,count);
        }
        return max;
    }
}