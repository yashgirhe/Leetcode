class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int i : nums1){
            hs1.add(i);
        }
        for(int i : nums2){
            if(hs1.contains(i)){
                hs2.add(i);
                hs1.remove(i);
            }
        }
        int idx = 0;
        int[] res = new int[hs2.size()];
        for(int i : hs2){
            res[idx] = i;
            idx++;
        }
        return res;
    }
}