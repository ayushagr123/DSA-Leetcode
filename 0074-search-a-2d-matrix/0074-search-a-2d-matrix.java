class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Find the upper bound for the target from last column
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m-1;
        int row = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid][n-1] == target) return true;
            else if(matrix[mid][n-1]>target){
                row = mid;
                high = mid-1;
            }
            else low = mid+1;
        }

        //Now apply binary search in the row obtained from previous lower bound
        low = 0;
        high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[row][mid] == target) return true;
            else if(matrix[row][mid] > target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}