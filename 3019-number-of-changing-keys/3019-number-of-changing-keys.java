class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        if(s.length() == 1) return 0;
        for(int i=1; i<s.length(); i++){
            Character c = s.charAt(i);
            if(c == s.charAt(i-1) || Character.toUpperCase(c) == s.charAt(i-1) || Character.toLowerCase(c) == s.charAt(i-1)) continue;
            else count++;
        }
        return count;
    }
}