class Solution {
    public String firstPalindrome(String[] words) {
        String str = "";
        for(int i=0; i<words.length; i++){
            if(checkPalindrome(words[i])) return words[i];
        }
        return str;
    }
    public static boolean checkPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}