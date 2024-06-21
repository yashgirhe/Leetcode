class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = -1;
        for(int i=0; i<sentences.length; i++){
            max = Math.max(max,sentences[i].split(" ").length);
        }
        return max;
    }
}