
// r-1
//     C
//       n-1
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        // calculate nCr
        for(int row=1;row<=numRows;row++){
            List<Integer> pascalInner = new ArrayList<>();
            for(int col=1;col<=row;col++){
                int ans = 1;
                for(int j=0;j<col-1;j++){
                    ans = ans*(row-1-j);
                    ans = ans/(j+1);
                }
                pascalInner.add(ans);
            }
            pascal.add(pascalInner);
        }

        return pascal;
    }
}