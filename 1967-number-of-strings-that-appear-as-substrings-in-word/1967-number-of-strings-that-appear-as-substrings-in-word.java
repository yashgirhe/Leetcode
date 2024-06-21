class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        HashSet<String> hs = new HashSet<>();
        for(int i=0; i<word.length(); i++){
            for(int j=i; j<word.length(); j++){
                hs.add(word.substring(i,j+1));
            }
        }
        for(int i=0;i<patterns.length; i++){
            if(hs.contains(patterns[i])){
                ans++;
            }
        }
        return ans;
    }
}