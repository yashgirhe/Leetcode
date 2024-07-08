class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            boolean flag = true;
            String str = words[i];
            for(int j=0; j<str.length(); j++){
                if(allowed.indexOf(str.charAt(j)) == -1){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}