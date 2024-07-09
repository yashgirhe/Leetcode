class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1 = 0;
        int count2 = 0;
        boolean[] l1 = new boolean[101];
        boolean[] l2 = new boolean[101];

        for(int i:nums1) l1[i] = true;
        for(int i:nums2) l2[i] = true;

        for(int i:nums1){
            if(l2[i]) count1++;
        }
        for(int i:nums2){
            if(l1[i]) count2++;
        }
        return new int[]{count1,count2};
    }
}