class Solution {
    public boolean isPalindrome(String s) {
        //First remove all the non-alphanumeric characters from the string
        String newString = s.replaceAll("[^a-zA-Z0-9]","");
        String finalstring = newString.toLowerCase();
        String reverse = new StringBuilder(finalstring).reverse().toString();
        if(reverse.equals(finalstring)) return true;
        else return false;
    }
}