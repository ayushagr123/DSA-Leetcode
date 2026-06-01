class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = m-1;
        int colEnd = n-1;
        List<Integer> spiral = new ArrayList<>();
        while(colStart<=colEnd && rowStart<=rowEnd){
            for(int i = colStart;i<=colEnd;i++){
                spiral.add(matrix[rowStart][i]);
            }
            rowStart++;
            for(int i = rowStart;i<=rowEnd;i++){
                spiral.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowStart<=rowEnd){
                for(int i = colEnd;i>=colStart;i--){
                    spiral.add(matrix[rowEnd][i]);
                }
            
            rowEnd--;
            }
            if(colStart<=colEnd){
                for(int i = rowEnd;i>=rowStart;i--){
                    spiral.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        return spiral;
    }
}