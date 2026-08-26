class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Iterate through all the characters in the string

        //As you iterate, store the characters in a hash map if they are not present in it .

        //For every new character check for its existence in the hash map, if it is already present reset the substring chain and start forming a new chain from that character.

        //Problem is resetting the old hashMap once a duplicate character is found.

        //We will use sliding window approach;
        //initialize two pointers l and r both pointing at starting of the string

        //Shrink the substring if the character at left index already exist in the hash set or else expand the substring by moving right pointer right wards and adding the new character to the hashSet.

        int l = 0;
        int res = 0;
        Set<Character> st = new HashSet<>();
        for(int r = 0;r<s.length();r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
           st.add(s.charAt(r));
           res = Math.max(res,r-l+1);
        }
        return res;
    }
}