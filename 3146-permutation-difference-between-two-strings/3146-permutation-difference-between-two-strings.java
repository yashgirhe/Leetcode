class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> charactersFromS = new HashMap<>();
        HashMap<Character,Integer> charactersFromT = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            charactersFromS.put(s.charAt(i),i);
        }
        for (int i=0; i<t.length(); i++){
            charactersFromT.put(t.charAt(i),i);
        }
        int sum =0;
        for (int i=0; i<s.length(); i++){
            sum += Math.abs(charactersFromS.get(s.charAt(i)) - charactersFromT.get((s.charAt(i))));
        }
        return sum;
    }
}