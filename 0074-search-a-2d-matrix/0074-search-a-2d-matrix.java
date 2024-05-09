class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean isPresent = false;
        for (int i=0; i<matrix.length; i++){
            if(target <= matrix[i][matrix[i].length-1]){
                int start = 0;
                int end = matrix[i].length-1;
                while (start <= end){
                    int mid = (start+end)/2;
                    if (target == matrix[i][mid]){
                        isPresent = true;
                        break;
                    }
                    else if (target < matrix[i][mid]){
                        end = mid-1;
                    }
                    else {
                        start = mid +1;
                    }
                }
            }
        }
        return isPresent;
    }
}