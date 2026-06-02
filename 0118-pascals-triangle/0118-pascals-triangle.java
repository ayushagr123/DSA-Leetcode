class Solution {
    public List<List<Integer>> generate(int numRows) {
        //To calculate nCr of a number
        // n!/(n-r)!*r!
        //First calculate r factorial
        //Then calculate n-r factorial
        // then calculate r factorial
        //instead of this you can directly calculate nCr using the method as shown in factorial
        List<List<Integer>> result = new ArrayList<>();

        for(int row = 1;row<=numRows;row++){
            int m = 1;
            List<Integer> currRow = new ArrayList<>();
            for(int col = 1;col<=row;col++){
                if(col!=1){
                    m = m*(row-col+1);
                    m = m/(col-1);
                }
                currRow.add(m);   
            }
            result.add(currRow);
        }
        return result;
    }
    //To calculate nCR
    
}