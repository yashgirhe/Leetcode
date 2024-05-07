class Solution {
    public int[] pivotArray(int[] a, int pivot) {
        int n = a.length;
        int equalsCount = 0;
        int lessCount = 0;
        int [] b = new int[n];
        int j = 0;
        //fill small elements
        for (int i=0; i<n; i++){
            if (a[i] < pivot){
                b[j] = a[i];
                j++;
                lessCount++;
            } else if (a[i] == pivot) {
                equalsCount++;
            }
        }
        //fill similar elements
        for (int i=lessCount; i<(lessCount+equalsCount); i++){
            b[i] = pivot;
        }
        //fill greater elements
        int k = lessCount+equalsCount;
        for (int i=0; i<n; i++){
            if (a[i] > pivot){
                b[k] = a[i];
                k++;
            }
        }
        return b;
    }
    }