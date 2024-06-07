class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i: nums1) s1.add(i);
        for (int i: nums2) s2.add(i);

        for (int i : s1){
            if (!s2.contains(i)){
                al1.add(i);
            }
        }
        for (int i : s2){
            if (!s1.contains(i)){
                al2.add(i);
            }
        }
        result.add(al1);
        result.add(al2);
        return result;
    }
}