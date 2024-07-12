class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i = 'a'; i<='z'; i++){
            if(sentence.indexOf(i) == -1) return false;
        }
        return true;
        
        // int[] arr = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     arr[s.charAt(i) - 'a'] = 1;
        // }
        // boolean flag = true;
        // for (int i=0; i< arr.length; i++){
        //     if (arr[i] == 0){
        //         flag = false;
        //         break;
        //     }
        //     System.out.println();
        // }
    }
}