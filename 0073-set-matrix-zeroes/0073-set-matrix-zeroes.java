// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();
        int m=matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    if(!rows.contains(i)) rows.add(i);
                    if(!columns.contains(j)) columns.add(j);
                }
            }
        }
        for(int i:columns){
            for(int a=0;a<m;a++){
                matrix[a][i] =0;
            }
        }
        for(int j:rows){
            for(int b=0;b<n;b++){
                matrix[j][b]=0;
            }
        }
    }
}