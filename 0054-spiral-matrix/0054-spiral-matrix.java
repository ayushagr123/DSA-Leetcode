class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // List<Integer> spiral = new ArrayList<>();
        // int m = matrix.length;
        // int n= matrix[0].length;
        // int rowStart =0, colStart = 0;
        // int colEnd = n;
        // int rowEnd = m;
        // boolean rightMov=false;
        // boolean bottomMov =false;
        // //Right
        // while(rowStart<rowEnd && colStart<colEnd){
        //     //Right
        //     for(int j=colStart;j<colEnd;j++){
        //         spiral.add(matrix[rowStart][j]);
        //         rightMov = true;
        //     }
        //     //Bottom
        //     for(int i=rowStart+1;i<rowEnd;i++){
        //         spiral.add(matrix[i][colEnd-1]);
        //         bottomMov = true;
        //     }
        //     //Left
        //     if(bottomMov){
        //         for(int j=colEnd-1-1;j>=colStart;j--){
        //             spiral.add(matrix[rowEnd-1][j]);
        //             rightMov = true; 
        //         }
        //     }
        //     //Top
        //     if(rightMov){
        //         for(int i=rowEnd-1-1;i>=rowStart+1;i--){
        //         spiral.add(matrix[i][colStart]);
        //     }
        // }
        // rowEnd--;
        // colEnd--;
        // rowStart++;
        // colStart++;
        // rightMov = false;
        // bottomMov = false;
        // }
        // return spiral;



        List<Integer> spiral = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int rowStart = 0, colStart = 0;
        int colEnd = n;
        int rowEnd = m;

        while (rowStart < rowEnd && colStart < colEnd) {
            // Right
            for (int j = colStart; j < colEnd; j++) {
                spiral.add(matrix[rowStart][j]);
            }
            
            // Bottom
            for (int i = rowStart + 1; i < rowEnd; i++) {
                spiral.add(matrix[i][colEnd - 1]);
            }
            
            // Left
            // FIX: Only go left if we are not on the same row where we started
            if (rowStart < rowEnd - 1) { 
                for (int j = colEnd - 2; j >= colStart; j--) {
                    spiral.add(matrix[rowEnd - 1][j]);
                }
            }
            
            // Top
            // FIX: Only go up if we are not on the same column where we went down
            if (colStart < colEnd - 1) { 
                for (int i = rowEnd - 2; i > rowStart; i--) {
                    spiral.add(matrix[i][colStart]);
                }
            }
            
            rowEnd--;
            colEnd--;
            rowStart++;
            colStart++;
        }
        return spiral;
    }
}