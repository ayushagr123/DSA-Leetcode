class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> freqMap = new HashMap<>();
        for(char c: t.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        int req = freqMap.size();
        int l = 0;
        int count = 0;
        int len = Integer.MAX_VALUE; 
        int startIndx = 0;
        for(int r = 0;r<s.length();r++){
            if(freqMap.containsKey(s.charAt(r)) && freqMap.get(s.charAt(r)).equals(1)) count++;
            freqMap.put(s.charAt(r),freqMap.getOrDefault(s.charAt(r),0)-1);
            
            while(count == req){
                if(r-l+1<len) {
                    len = r-l+1;
                    startIndx = l;
                }
                freqMap.put(s.charAt(l),freqMap.getOrDefault(s.charAt(l),0)+1);
                if(freqMap.containsKey(s.charAt(l)) && freqMap.get(s.charAt(l))>0) count--;
                l++;
            }
        }
        if(len == Integer.MAX_VALUE) return "";
        else return s.substring(startIndx,startIndx+len);
    }
}