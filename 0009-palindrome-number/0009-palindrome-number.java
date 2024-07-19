class Solution {
    public boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0){
            int lastDigit = num % 10;
            reverse = (reverse*10) + lastDigit;
            num = num/10;
        }
        if(reverse == original) return true;
        else return false;
    }
}