class Solution {
    public String finalString(String s) {
        StringBuffer sb = new StringBuffer();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'i') sb.reverse();
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}