class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<letters.length; i++){
            int x = target;
            int y = letters[i];
            if((y-x) > 0){
                smallest = Math.min(smallest,y);
            }
        }
        if (smallest == Integer.MAX_VALUE){
            return letters[0];
        }
        else{
            return (char)smallest;
        }
    }
}