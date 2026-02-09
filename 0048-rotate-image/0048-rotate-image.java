class Solution {
    public void rotate(int[][] matrix) {
        //columns becomes rows(1st row -> last column)
        //rows become columns(1st column -> last column)
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                newMatrix[i][j] = matrix[i][j];
            }
        }


        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][n-1-i] = newMatrix[i][j];
            }
        }
    }
}