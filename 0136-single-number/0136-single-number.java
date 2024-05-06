class Solution {
    public int singleNumber(int[] n) {
         HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<n.length; i++){
            int value = hm.getOrDefault(n[i],0);
            hm.put(n[i],value+1);
        }
        for (Map.Entry<Integer, Integer> it : hm.entrySet()){
            if (it.getValue() == 1){
                return it.getKey();
            }
        }
        return -1;
    }
}