class Solution {
    public int[] minOperations(String boxes) {
        int before = 0;
        int after = 0;
        int n = boxes.length();
        int[] res = new int[n];
        //count operations required for 0th index
        for(int i=0; i<n; i++){
            if(boxes.charAt(i) == '1'){
                after++;
                res[0] += i;
            }
        }
        if(boxes.charAt(0) == '1'){
            before++;
            after--;
        }
        for(int i=1; i<n; i++){
            res[i] += res[i-1] - after + before;
            if(boxes.charAt(i) == '1'){
            before++;
            after--;
            }
        }
        return res;
    }

    // public int[] minOperations(String boxes) {
    //     char[] charArray = boxes.toCharArray();
    //     int n = charArray.length;
    //     int[] res = new int[n];
    //     for (int i=0; i< n; i++){
    //         int sum = 0;
    //         for (int j=0; j< n; j++){
    //             if (charArray[j] == '1'){
    //                 int diff = Math.abs(j-i);
    //                 sum += diff;
    //             }
    //         }
    //         res[i] = sum;
    //     }
    //     return res;
    // }
}