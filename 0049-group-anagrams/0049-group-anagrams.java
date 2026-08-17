class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sString = new String(ch);
            map.putIfAbsent(sString,new ArrayList<>());
            map.get(sString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}