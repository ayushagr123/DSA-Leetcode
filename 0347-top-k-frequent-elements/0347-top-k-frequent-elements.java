class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Approach is to use a hashMap and store the frequency of each element
        //Now create a list whose indices represents the frequency and the value represents the number occuring as equal to its corresponding index.

        //Create a hashMap and store the frequency of each element
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int elem:nums){
            mpp.put(elem,mpp.getOrDefault(elem,0)+1);   
        }

        //Create an array of list to implement bucket sort
        List<Integer>[] freq = new List[nums.length+1];

        for(int i = 0;i<freq.length;i++){
            freq[i] = new ArrayList();
            
        }

        //Map the frequency of each elements from map into the list
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){

            freq[entry.getValue()].add(entry.getKey());

        }

        int[] res = new int[k];
        int index = 0;
        for(int i = freq.length-1;i>0 && index<k;i--){
            for(int value:freq[i]){
                res[index] = value;
                index++;
                if(index == k) return res;
            }
        }
        return res;

    }
}