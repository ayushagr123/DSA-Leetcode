class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int ans = 0;
        int maxFreq = 0;
        Map<Character,Integer> mpp = new HashMap<>();
        for(;r<s.length();r++){
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
            maxFreq = Math.max(maxFreq,mpp.get(s.charAt(r)));
            if(r-l+1-maxFreq>k){
                mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}