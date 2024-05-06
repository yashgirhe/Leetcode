class Solution {
    public int[] searchRange(int[] a, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
}