class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();
        for(char c: t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }

        int l = 0;
        int count = 0;
        int[] resLen = {-1,-1};
        int currLen = 0;
        int minLen = Integer.MAX_VALUE;
        for(int r = 0;r<s.length();r++){
            smap.put(s.charAt(r),smap.getOrDefault(s.charAt(r),0)+1);
            if(tmap.containsKey(s.charAt(r)) && tmap.get(s.charAt(r)).equals(smap.get(s.charAt(r)))) count++;
            while(count == tmap.size()){    //We have a valid window
                currLen = r-l+1;
                if(currLen < minLen){
                    minLen = currLen;
                    resLen[0] = l;
                    resLen[1] = r;
                }
                smap.put(s.charAt(l),smap.getOrDefault(s.charAt(l),0)-1);
                if(tmap.containsKey(s.charAt(l)) && tmap.get(s.charAt(l))>smap.get(s.charAt(l))) count--;
                l++;
            }  
        }
        if(minLen == Integer.MAX_VALUE) return "";
        else return s.substring(resLen[0],resLen[1]+1);
    }
}