class Solution {
    public void setZeroes(int[][] matrix) {
        int colRem=1;
        int m = matrix.length;
        int n = matrix[0].length;

        for(int j=0;j<m;j++){
            if(matrix[j][0]==0){
                colRem = 0;
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i=1;i<m;i++){
            if(matrix[i][0] == 0){
                for(int b=0;b<n;b++){
                    matrix[i][b] = 0;
                }
            }
        }
        
        for(int j=1;j<n;j++){
            if(matrix[0][j]==0){
                for(int a =0;a<m;a++){
                    matrix[a][j] = 0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int a=0;a<n;a++){
                matrix[0][a]=0;
            }
        }
        if(colRem ==0){
            for(int a =0;a<m;a++){
                matrix[a][0] = 0;
            }
        }
    }
}