class Solution {
    public boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^a-zA-Z0-9]","");
        newStr = newStr.toLowerCase();
        int i=0;
        int j=newStr.length()-1;
        while (i<j){
            if (newStr.charAt(i) != newStr.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}