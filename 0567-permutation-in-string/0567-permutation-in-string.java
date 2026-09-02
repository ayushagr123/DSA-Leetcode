class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] freqs1 = new int[26];
        int[] freqs2 = new int[26];
        for(int i = 0;i<s1.length();i++){
            freqs1[s1.charAt(i)-'a']++;
            freqs2[s2.charAt(i)-'a']++;
        }
        int matches = 0;
        for(int i = 0;i<26;i++){
            if(freqs1[i] == freqs2[i]) matches++;
        }

        int l = 0;
        for(int r = s1.length();r<s2.length();r++){
            if(matches == 26) return true;
            int index = s2.charAt(r)-'a';
            freqs2[index]++;
            if(freqs1[index] == freqs2[index]) matches++;
            else if(freqs1[index] + 1 == freqs2[index]) matches--;
            
            index = s2.charAt(l)-'a';
            freqs2[index]--;
            if(freqs1[index] == freqs2[index]) matches++;
            else if(freqs1[index] -1 == freqs2[index]) matches--;
            l++; 
        }
        return matches == 26;
    }
}
