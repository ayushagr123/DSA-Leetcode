class Solution {
    public boolean isPalindrome(String s) {
        //use two pointers and check if first half of string equals other half
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && !alphaNumeric(s,i)) i++;
            while(i<j && !alphaNumeric(s,j)) j--;
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
    public static boolean alphaNumeric(String s, int i){
        if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') return true;
        return false;
    } 
}